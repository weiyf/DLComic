package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentMineBinding;

/**
 * Created by Administrator on 2017/2/22.
 */

public class MineFragment extends BaseFragment {

    private FragmentMineBinding mMineBinding;

    public static MineFragment newInstance() {

        Bundle args = new Bundle();

        MineFragment fragment = new MineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mMineBinding = FragmentMineBinding.inflate(inflater, container, false);
        return mMineBinding.getRoot();
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {

    }
}
