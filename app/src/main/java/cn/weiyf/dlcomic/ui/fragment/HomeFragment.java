package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import cn.weiyf.dlcomic.R;
import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentHomeBinding;
import cn.weiyf.dlcomic.entity.Comic;
import cn.weiyf.dlcomic.entity.Recommend;
import cn.weiyf.dlcomic.net.DLObserver;
import cn.weiyf.dlcomic.util.CommonUtils;
import cn.weiyf.dlcomic.util.GlideImageLoader;
import cn.weiyf.dlframe.adapter.SingleTypeAdapter;
import cn.weiyf.dlframe.listener.OnItemClickListener;
import cn.weiyf.dlframe.net.DLException;

import static com.youth.banner.BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE;

/**
 * Created by Administrator on 2017/2/22.
 */

public class HomeFragment extends BaseFragment {

    private FragmentHomeBinding mHomeBinding;

    private Presenter mPresenter;

    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mHomeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        return mHomeBinding.getRoot();
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        mPresenter = new Presenter();
        mPresenter.init();
    }

    public class Presenter extends BasePresenter implements OnItemClickListener<Comic>,
            SwipeRefreshLayout.OnRefreshListener, AppBarLayout.OnOffsetChangedListener,
            TabLayout.OnTabSelectedListener{

        private ArrayList<SingleTypeAdapter<Comic>> mAdapters;
        private ArrayList<RecyclerView.LayoutManager> mLayoutManagers;

        List<String> images = null;

        List<String> titles = null;

        RankFragment[] rankFragments = null;


        @Override
        protected void init() {
            images = new ArrayList<>();
            titles = new ArrayList<>();
            mHomeBinding.setPresenter(this);
            mAdapters = new ArrayList<>();
            mLayoutManagers = new ArrayList<>();
            rankFragments = new RankFragment[]{RankFragment.newInstance(),
                    RankFragment.newInstance(), RankFragment.newInstance()};
            for (int i = 0; i < 6; i++) {
                mLayoutManagers.add(new LinearLayoutManager(mActivity, LinearLayoutManager.HORIZONTAL, false));
                SingleTypeAdapter<Comic> adapter = new SingleTypeAdapter<>(R.layout.item_comic);
                adapter.setOnItemClickListener(this);
                mAdapters.add(adapter);
            }
            mHomeBinding.setAdapters(mAdapters);
            mHomeBinding.setLayoutManagers(mLayoutManagers);
            mHomeBinding.setRefreshListener(this);
            mHomeBinding.banner.setImageLoader(new GlideImageLoader());
            mHomeBinding.banner.setBannerStyle(CIRCLE_INDICATOR_TITLE_INSIDE);
            onRefresh();
            loadMultipleRootFragment(R.id.rank, 0, rankFragments);
        }

        void loadData() {
            images.clear();
            titles.clear();
            getService().getRecommend()
                    .compose(bindToLifecycle())
                    .compose(CommonUtils.handleResult())
                    .subscribe(new DLObserver<Recommend>(getFragmentManager()) {
                        @Override
                        public void _onNext(Recommend recommend) {

                            mHomeBinding.setBookList(recommend.getBook());
                            for (int i = 0; i < 6; i++) {
                                mAdapters.get(i).clear();
                                mAdapters.get(i).addAll(recommend.getBook().get(i).getData());
                            }
                            mHomeBinding.setIsRefresh(false);
                            for (Recommend.SlideListBean slideListBean : recommend.getSlide_list()) {
                                images.add(String.format(Locale.getDefault(), "%s%03d.jpg", slideListBean.getImage(), slideListBean.getId()));
                                titles.add(slideListBean.getSlide_desc());
                            }
                            mHomeBinding.banner.update(images, titles);
                            mHomeBinding.banner.start();
                            rankFragments[0].setData(recommend.getHot_list());
                            rankFragments[1].setData(recommend.getGold_list());
                            rankFragments[2].setData(recommend.getMonth_ticket_list());
                        }

                        @Override
                        public void _onError(DLException exception) {
                            super._onError(exception);
                            mHomeBinding.setIsRefresh(false);
                        }
                    });

        }

        @Override
        public void onItemClick(int i, Comic dataBean) {
//            start(ComicFragment.newInstance(dataBean));
        }

        @Override
        public void onRefresh() {
            loadData();
        }

        public void more(int bookId) {
//            start(MoreRecomFragment.newInstance(bookId, mHomeBinding.getBookList().get(bookId - 1).getBook_name()));
        }

        public void rank() {
            start(RankFragment.newInstance());
        }

        @Override
        public String title() {
            return "知音漫客";
        }

        @Override
        public int menuRes() {
            return R.menu.menu_home;
        }

        @Override
        public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
            float alpha = (float) Math.abs(verticalOffset) / appBarLayout.getTotalScrollRange();
            mHomeBinding.title.setAlpha(alpha);
        }

        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            showHideFragment(rankFragments[tab.getPosition()]);
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    }
}
