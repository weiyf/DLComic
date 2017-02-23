package cn.weiyf.dlcomic;

import cn.weiyf.dlcomic.base.Constant;
import cn.weiyf.dlcomic.net.client.ComicClient;
import cn.weiyf.dlcomic.ui.activity.MainActivity;
import cn.weiyf.dlframe.DLApplication;
import cn.weiyf.dlframe.base.BaseCompatActivity;
import cn.weiyf.dlframe.net.DLHttp;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by Administrator on 2017/2/22.
 */

public class AppContext extends DLApplication {
    public static AppContext mInstance;

    private ComicClient mService;

//    private DaoSession mDaoSession;

//    public static PreferencesUtility_ preferencesUtility;


    @Override
    public void onCreate() {
        super.onCreate();
        if (mInstance == null) {
            synchronized (AppContext.class) {
                if (mInstance == null) {
                    mInstance = AppContext.this;
                }
            }
        }

//        Fragmentation.builder()
//                .debug(isDebug())
//                .stackViewMode(isDebug() ? Fragmentation.BUBBLE : Fragmentation.NONE)
//                .install();

        if (mService == null) {
            synchronized (ComicClient.class) {
                if (mService == null) {
//                    HashMap<String, String> parametersMap = new HashMap<>();
//                    parametersMap.put("key", Constant.KEY);
                    mService = new DLHttp.Builder()
                            .baseUrl(Constant.BASE_URL)
                            .connectTimeout(15)
                            .writeTimeout(30)
                            .readTimeout(30)
                            .retryOnConnectionFailure(true)
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .cache(10)
//                            .addCommonParameters(parametersMap)
                            .create(ComicClient.class);
                }
            }
        }

//        if (preferencesUtility == null) {
//            preferencesUtility = PreferencesUtility_.create(getApplicationContext());
//        }
//        if (mDaoSession == null) {
//            synchronized (DaoSession.class) {
//                if (mDaoSession == null) {
//                    DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,
//                            Constant.ENCRYPTED ? "dltools-db-encrypted" : "dltools-db");
//                    Database db = Constant.ENCRYPTED ? helper.getEncryptedWritableDb("dltools") : helper.getWritableDb();
//                    mDaoSession = new DaoMaster(db).newSession();
//                }
//            }
//        }

    }



    public ComicClient getService() {
        return mService;
    }

//    public DaoSession getDaoSession() {
//        return mDaoSession;
//    }

    @Override
    public Class<? extends BaseCompatActivity> getMainPage() {
        return MainActivity.class;
    }

    @Override
    public String getLogTag() {
        return getResources().getString(R.string.app_name) + "-Log";
    }

}
