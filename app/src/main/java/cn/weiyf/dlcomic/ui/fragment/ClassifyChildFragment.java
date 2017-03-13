package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cn.weiyf.dlcomic.R;
import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentClassifyChildBinding;
import cn.weiyf.dlcomic.entity.Config;
import cn.weiyf.dlframe.adapter.SingleTypeAdapter;
import cn.weiyf.dlframe.listener.OnItemClickListener;

/**
 * Created by Administrator on 2017/2/6.
 */

public class ClassifyChildFragment extends BaseFragment {

    private FragmentClassifyChildBinding mClassifyChildBinding;

    private Presenter mPresenter;

    public static ClassifyChildFragment newInstance(ArrayList<Config.ComicType.DataBean> data) {

        Bundle args = new Bundle();
        args.putParcelableArrayList("data", data);
        ClassifyChildFragment fragment = new ClassifyChildFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mClassifyChildBinding = FragmentClassifyChildBinding.inflate(inflater, container, false);
        return mClassifyChildBinding.getRoot();
    }

    @Override
    protected void initViews(@Nullable Bundle bundle) {
        mPresenter = new Presenter();
        mPresenter.init();
    }

    public class Presenter implements OnItemClickListener<Config.ComicType.DataBean> {

        public ArrayList<Config.ComicType.DataBean> data;

        void init() {
            GridLayoutManager layoutManager = new GridLayoutManager(mActivity, 3);
            SingleTypeAdapter<Config.ComicType.DataBean> comicAdapter = new SingleTypeAdapter<>(R.layout.item_comic_type);
            mClassifyChildBinding.setLayoutManager(layoutManager);
            mClassifyChildBinding.setAdapter(comicAdapter);
            comicAdapter.setOnItemClickListener(this);

            if (getArguments() != null) {
                data = getArguments().getParcelableArrayList("data");
                comicAdapter.addAll(data);
            }
        }

        @Override
        public void onItemClick(int position, Config.ComicType.DataBean dataBean) {
//            ((BaseFragment)getParentFragment()).start(SortFragment.newInstance(dataBean));
        }
    }
}
