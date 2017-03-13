package cn.weiyf.dlcomic.base;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.FragmentEvent;

import cn.weiyf.dlcomic.AppContext;
import cn.weiyf.dlcomic.net.client.ComicClient;
import cn.weiyf.dlframe.base.BaseCompatFragment;


public abstract class BaseFragment extends BaseCompatFragment implements LifecycleProvider<FragmentEvent> {



    public abstract class BasePresenter extends BasePresenterWithTopBar {


        @Override
        public void back() {
            if (isBack()) {
                _mActivity.onBackPressed();
            }
        }

        protected abstract void init();


        public ComicClient getService() {
            return AppContext.mInstance.getService();
        }
    }

}
