package cn.weiyf.dlcomic.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.databinding.FragmentBookshelfBinding;

/**
 * Created by Administrator on 2017/2/22.
 */

public class BookShelfFragment extends BaseFragment {

    private FragmentBookshelfBinding mBookshelfBinding;

    public static BookShelfFragment newInstance() {

        Bundle args = new Bundle();

        BookShelfFragment fragment = new BookShelfFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBookshelfBinding = FragmentBookshelfBinding.inflate(inflater, container,false);
        return mBookshelfBinding.getRoot();
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {

    }
}
