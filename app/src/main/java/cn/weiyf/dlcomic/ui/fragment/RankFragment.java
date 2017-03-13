package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cn.weiyf.dlcomic.R;
import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentRankBinding;
import cn.weiyf.dlcomic.entity.Recommend;
import cn.weiyf.dlframe.adapter.SingleTypeAdapter;

/**
 * Created by Administrator on 2017/2/24.
 */

public class RankFragment extends BaseFragment {

    private FragmentRankBinding mRankBinding;

    private Presenter mPresenter;

    public static RankFragment newInstance() {

        Bundle args = new Bundle();
        RankFragment fragment = new RankFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRankBinding = FragmentRankBinding.inflate(inflater, container, false);
        return mRankBinding.getRoot();
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        mPresenter = new Presenter();
        mPresenter.init();
    }

    public void setData(ArrayList<Recommend.RankListBean> rankList) {
        if (getArguments() != null) {
            getArguments().putParcelableArrayList("rankList", rankList);
        }
        mPresenter.adapter.clear();
        mPresenter.adapter.addAll(rankList);
        for (Recommend.RankListBean rankListBean : rankList) {
            rankListBean.setOrderby("共被打赏" + Integer.parseInt(rankListBean.getOrderby()) / 10000 + "万" + (Integer.parseInt(rankListBean.getOrderby()) - Integer.parseInt(rankListBean.getOrderby()) / 10000 * 10000) + "个元宝");
        }
    }


    public class Presenter extends BasePresenter {

        private SingleTypeAdapter<Recommend.RankListBean> adapter;


        @Override
        protected void init() {
            if (getArguments() != null) {
                ArrayList<Recommend.RankListBean> rankList = getArguments().getParcelableArrayList("rankList");
                if (rankList != null) {
                    adapter.addAll(rankList);
                }
            }
            adapter = new SingleTypeAdapter<>(R.layout.item_rank1);
            LinearLayoutManager layoutManager = new LinearLayoutManager(mActivity);
            mRankBinding.setAdapter(adapter);
            mRankBinding.setLayoutManager(layoutManager);
        }

        @Override
        public String title() {
            return null;
        }
    }
}
