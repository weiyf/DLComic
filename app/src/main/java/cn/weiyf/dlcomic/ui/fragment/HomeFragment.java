package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentHomeBinding;

/**
 * Created by Administrator on 2017/2/22.
 */

public class HomeFragment extends BaseFragment {

    private FragmentHomeBinding mHomeBinding;

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

    }
}
