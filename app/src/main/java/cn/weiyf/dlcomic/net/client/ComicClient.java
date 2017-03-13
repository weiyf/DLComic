package cn.weiyf.dlcomic.net.client;


import cn.weiyf.dlcomic.entity.BookInfo;
import cn.weiyf.dlcomic.entity.ComicInfo;
import cn.weiyf.dlcomic.entity.Config;
import cn.weiyf.dlcomic.entity.Recommend;
import cn.weiyf.dlcomic.entity.Sort;
import cn.weiyf.dlcomic.net.BaseResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/2/3.
 */

public interface ComicClient {

    @GET("getconfig")
    Observable<BaseResponse<Config>> getConfig();

    @GET("getrecommend")
    Observable<BaseResponse<Recommend>> getRecommend();

    @GET("getcomicinfo")
    Observable<BaseResponse<ComicInfo>> getComicInfo(@Query("comic_id") int comicId);

    @GET("getsortlist")
    Observable<BaseResponse<Sort>> getSortlist(@Query("sort") String sort, @Query("type") int type, @Query("page") int page);

    @GET("getbookinfo")
    Observable<BaseResponse<BookInfo>> getBookInfo(@Query("book_id") int bookId);


}
