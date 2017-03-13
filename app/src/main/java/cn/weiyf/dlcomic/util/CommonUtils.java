package cn.weiyf.dlcomic.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.weiyf.dlcomic.net.BaseResponse;
import cn.weiyf.dlframe.net.DLException;
import cn.weiyf.dlframe.utils.BaseCommonUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/25.
 */

public class CommonUtils extends BaseCommonUtils {
    public static <T> ObservableTransformer<BaseResponse<T>, T> handleResult() {
        try {
            return baseResponseObservable -> baseResponseObservable
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .flatMap(baseResponse -> {
                        if (baseResponse.getStatus() == 0) {
                            return Observable.just(baseResponse.getData());
                        } else {
                            return Observable.error(new DLException(baseResponse.getMsg(), baseResponse.getStatus()));
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
            return baseResponseObservable -> baseResponseObservable
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .flatMap(tBaseResponse -> Observable.error(new Throwable("服务器错误")));
        }

    }

    public static String formatDay(long date) {
        return millisecondToDate(date, "yyyy-MM-dd");
    }

    public static String millisecondToDate(long millisecond, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = new Date(millisecond);
        return format.format(date);
    }
}
