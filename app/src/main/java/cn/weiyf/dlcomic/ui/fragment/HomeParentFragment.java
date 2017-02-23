package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.weiyf.dlcomic.R;
import cn.weiyf.dlcomic.base.BaseMainFragment;


/**
 * Created by Administrator on 2017/2/6.
 */

public class HomeParentFragment extends BaseMainFragment {

    public static HomeParentFragment newInstance() {

        Bundle args = new Bundle();

        HomeParentFragment fragment = new HomeParentFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_parent, container, false);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            loadRootFragment(R.id.parent_container, HomeFragment.newInstance());
        }
    }
}
