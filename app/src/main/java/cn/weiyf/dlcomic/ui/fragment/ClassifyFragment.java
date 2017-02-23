package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentClassifyBinding;

/**
 * Created by Administrator on 2017/2/22.
 */

public class ClassifyFragment extends BaseFragment {

    private FragmentClassifyBinding mClassifyBinding;

    public static ClassifyFragment newInstance() {

        Bundle args = new Bundle();

        ClassifyFragment fragment = new ClassifyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mClassifyBinding = FragmentClassifyBinding.inflate(inflater, container,false);
        return mClassifyBinding.getRoot();
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {

    }
}
