package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cn.weiyf.dlcomic.adapter.DLPagerAdapter;
import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentClassifyBinding;
import cn.weiyf.dlcomic.entity.Config;
import cn.weiyf.dlcomic.net.DLObserver;
import cn.weiyf.dlcomic.util.CommonUtils;

/**
 * Created by Administrator on 2017/2/22.
 */

public class ClassifyFragment extends BaseFragment {

    private FragmentClassifyBinding mClassifyBinding;

    private Presenter mPresenter;

    public static ClassifyFragment newInstance() {

        Bundle args = new Bundle();

        ClassifyFragment fragment = new ClassifyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mClassifyBinding = FragmentClassifyBinding.inflate(inflater, container, false);
        return mClassifyBinding.getRoot();
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        mPresenter = new Presenter();
        mPresenter.init();
    }

    public class Presenter extends BasePresenter {

        private ArrayList<BaseFragment> mFragments;
        private ArrayList<String> mTitles;

        @Override
        protected void init() {
            mClassifyBinding.setPresenter(this);
            mFragments = new ArrayList<>();
            mTitles = new ArrayList<>();
            loadData();
        }

        void loadData() {
            getService().getConfig()
                    .compose(bindToLifecycle())
                    .compose(CommonUtils.handleResult())
                    .subscribe(new DLObserver<Config>(getFragmentManager()) {
                        @Override
                        public void _onNext(Config config) {
                            for (Config.ComicType comicType : config.getComic_type()) {
                                mFragments.add(ClassifyChildFragment.newInstance(comicType.getData()));
                                mTitles.add(comicType.getSort_group());
                            }
                            mClassifyBinding.setAdapter(new DLPagerAdapter(getChildFragmentManager(),
                                    mFragments.toArray(new BaseFragment[mFragments.size()]), mTitles.toArray(new String[mTitles.size()])));
                        }
                    });

        }

        @Override
        public String title() {
            return "分类";
        }
    }
}
