package cn.weiyf.dlcomic.base;


import android.support.v7.widget.Toolbar;

public abstract class BasePresenterWithTopBar {

    public Toolbar.OnMenuItemClickListener menuListener;

    public abstract void back();

    public boolean isBack() {
        return true;
    }

    public abstract String title();

    public int menuRes() {
        return 0;
    }


}
