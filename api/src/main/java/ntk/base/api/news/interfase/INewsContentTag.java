package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsContentTagAddRequest;
import ntk.base.api.news.model.NewsContentTagCountRequest;
import ntk.base.api.news.model.NewsContentTagDeleteRequest;
import ntk.base.api.news.model.NewsContentTagEditRequest;
import ntk.base.api.news.model.NewsContentTagExportfileRequest;
import ntk.base.api.news.model.NewsContentTagGetAllRequest;
import ntk.base.api.news.model.NewsContentTagGetViewModelRequest;
import ntk.base.api.news.model.NewsContentTagResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface INewsContentTag {

    @POST("api/newsContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsContentTagGetAllRequest request);

    @GET("api/newsContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers, @Body NewsContentTagGetViewModelRequest request);

    @POST("api/newsContentTag/add/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsContentTagAddRequest request);

    @POST("api/newsContentTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsContentTagEditRequest request);

    @POST("api/newsContentTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsContentTagDeleteRequest request);

    @POST("api/newsContentTag/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> exportFile(@HeaderMap Map<String, String> headers, @Body NewsContentTagExportfileRequest request);

    @POST("api/newsContentTag/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsContentTagCountRequest request);
}
