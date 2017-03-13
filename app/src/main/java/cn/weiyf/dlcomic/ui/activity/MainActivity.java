package cn.weiyf.dlcomic.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

import cn.weiyf.dlcomic.R;
import cn.weiyf.dlcomic.base.BaseActivity;
import cn.weiyf.dlcomic.base.BaseFragment;
import cn.weiyf.dlcomic.base.BaseMainFragment;
import cn.weiyf.dlcomic.databinding.ActivityMainBinding;
import cn.weiyf.dlcomic.ui.fragment.BookShelfParentFragment;
import cn.weiyf.dlcomic.ui.fragment.ClassifyParentFragment;
import cn.weiyf.dlcomic.ui.fragment.HomeParentFragment;
import cn.weiyf.dlcomic.ui.fragment.MineParentFragment;
import me.yokeyword.fragmentation.SupportFragment;
import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class MainActivity extends BaseActivity implements BaseMainFragment.OnBackToFirstListener {


    private ActivityMainBinding mMainBinding;

    private Presenter mPresenter;

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mPresenter = new Presenter();
        mPresenter.mFragments = new BaseFragment[4];
        if (savedInstanceState == null) {
            mPresenter.mFragments[0] = HomeParentFragment.newInstance();
            mPresenter.mFragments[1] = ClassifyParentFragment.newInstance();
            mPresenter.mFragments[2] = BookShelfParentFragment.newInstance();
            mPresenter.mFragments[3] = MineParentFragment.newInstance();
            loadMultipleRootFragment(R.id.main_container, 0, mPresenter.mFragments);
        } else {
            mPresenter.mFragments[0] = findFragment(HomeParentFragment.class);
            mPresenter.mFragments[1] = findFragment(ClassifyParentFragment.class);
            mPresenter.mFragments[2] = findFragment(BookShelfParentFragment.class);
            mPresenter.mFragments[3] = findFragment(MineParentFragment.class);
        }
        mPresenter.init();
    }

    @Override
    public void onBackToFirstFragment() {
        mMainBinding.bottomBar.selectTabAtPosition(0);
    }


    public class Presenter {

        protected void init() {
            mMainBinding.setPresenter(this);
        }

        private SupportFragment[] mFragments;

        public OnTabSelectListener mTabSelectListener = tabId -> {
            if (tabId == R.id.tab_home) {
                showHideFragment(mFragments[0]);
            } else if (tabId == R.id.tab_classify) {
                showHideFragment(mFragments[1]);
            } else if (tabId == R.id.tab_bookshelf) {
                showHideFragment(mFragments[2]);
            } else if (tabId == R.id.tab_mime) {
                showHideFragment(mFragments[3]);
            }
        };

        public OnTabReselectListener mTabReselectListener = tabId -> {
            switch (tabId) {
                case R.id.tab_home:
                    break;
                case R.id.tab_classify:
                    break;
                case R.id.tab_bookshelf:
                    break;
                case R.id.tab_mime:
                    break;
            }
            // TODO: 2017/1/25 刷新
        };

    }

    @Override
    protected FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultHorizontalAnimator();
    }
}
