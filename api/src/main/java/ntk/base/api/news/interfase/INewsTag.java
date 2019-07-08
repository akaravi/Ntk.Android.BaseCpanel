package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsTagAddRequest;
import ntk.base.api.news.model.NewsTagCountRequest;
import ntk.base.api.news.model.NewsTagDeleteRequest;
import ntk.base.api.news.model.NewsTagEditRequest;
import ntk.base.api.news.model.NewsTagExportfileRequest;
import ntk.base.api.news.model.NewsTagGetAllRequest;
import ntk.base.api.news.model.NewsTagGetViewModelRequest;
import ntk.base.api.news.model.NewsTagResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsTag {

    @POST("api/newstag/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsTagGetAllRequest request);

    @GET("api/newstag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsTagResponse> GetViewModel(@HeaderMap Map<String, String> headers, @Body NewsTagGetViewModelRequest request);

    @POST("api/newstag/add/")
    @Headers({"content-type: application/json"})
    Observable<NewsTagResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsTagAddRequest request);

    @PUT("api/newstag/edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsTagEditRequest request);

    @DELETE("api/newstag/delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsTagDeleteRequest request);

    @POST("api/newstag/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<NewsTagResponse> exportFile(@HeaderMap Map<String, String> headers, @Body NewsTagExportfileRequest request);

    @POST("api/newstag/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsTagResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsTagCountRequest request);
}
