package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsContentTagAddRequest;
import ntk.base.api.news.model.NewsContentTagDeleteRequest;
import ntk.base.api.news.model.NewsContentTagEditRequest;
import ntk.base.api.news.model.NewsContentTagResponse;
import ntk.base.api.news.model.NewsCountRequest;
import ntk.base.api.news.model.NewsExportFileRequest;
import ntk.base.api.news.model.NewsGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsContentTag {

    @POST("api/newsContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/newsContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/newsContentTag/add/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsContentTagAddRequest request);

    @PUT("api/newsContentTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsContentTagEditRequest request);

    @DELETE("api/newsContentTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsContentTagDeleteRequest request);

    @POST("api/newsContentTag/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> exportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/newsContentTag/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentTagResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
