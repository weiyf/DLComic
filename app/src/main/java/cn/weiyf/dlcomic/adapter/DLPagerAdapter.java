package cn.weiyf.dlcomic.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cn.weiyf.dlcomic.base.BaseFragment;


/**
 * Created by Administrator on 2017/1/27.
 */

public class DLPagerAdapter extends FragmentPagerAdapter {


    private BaseFragment[] mFragments;

    private String[] mTitles;


    public DLPagerAdapter(FragmentManager fm, BaseFragment[] fragments) {
        super(fm);
        mFragments = fragments;
    }

    public DLPagerAdapter(FragmentManager fm, BaseFragment[] fragments, String[] titles) {
        super(fm);
        this.mFragments = fragments;
        this.mTitles = titles;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return mFragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mTitles != null) {
            return mTitles[position];
        } else {
            return super.getPageTitle(position);
        }
    }
}
