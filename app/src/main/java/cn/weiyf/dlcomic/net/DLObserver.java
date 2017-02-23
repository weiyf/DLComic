package cn.weiyf.dlcomic.net;

import android.support.v4.app.FragmentManager;

import cn.weiyf.dlframe.net.BaseObserver;
import cn.weiyf.dlframe.net.DLException;

/**
 * Created by Administrator on 2017/2/3.
 */

public abstract class DLObserver<T> extends BaseObserver<T> {
    public DLObserver(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public DLObserver(FragmentManager fragmentManager, boolean isShowLoading) {
        super(fragmentManager, isShowLoading);
    }

    @Override
    public void handlerError(DLException e) {

    }


}
