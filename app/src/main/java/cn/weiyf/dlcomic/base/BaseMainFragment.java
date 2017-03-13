package cn.weiyf.dlcomic.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.weiyf.dlcomic.ui.fragment.HomeParentFragment;


public abstract class BaseMainFragment extends BaseFragment {
    protected OnBackToFirstListener _mBackToFirstListener;


    @Override
    protected void initViews(@Nullable Bundle bundle) {
        if (mActivity instanceof OnBackToFirstListener) {
            _mBackToFirstListener = (OnBackToFirstListener) mActivity;
        } else {
            throw new RuntimeException(getParentFragment().toString()
                    + " must implement OnBackToFirstListener");
        }
    }


    /**
     * 处理回退事件
     *
     * @return
     */
    @Override
    public boolean onBackPressedSupport() {
        if (getChildFragmentManager().getBackStackEntryCount() > 1) {
            popChild();
        } else {
            if (this instanceof HomeParentFragment) {   // 如果是 第一个Fragment 则退出app
                _mActivity.finish();
            } else {                                    // 如果不是,则回到第一个Fragment
                _mBackToFirstListener.onBackToFirstFragment();
            }
        }
        return true;
    }

    public interface OnBackToFirstListener {
        void onBackToFirstFragment();
    }
}
