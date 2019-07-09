package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsContentAddRequest;
import ntk.base.api.news.model.NewsContentDeleteRequest;
import ntk.base.api.news.model.NewsContentEditRequest;
import ntk.base.api.news.model.NewsContentGetAllWithSimilarIdRequest;
import ntk.base.api.news.model.NewsContentResponse;
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

public interface INewsContent {

    @POST("api/newsContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/newsContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/newsContent/GetAllWithSimilarsId/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> GetAllWithSimilarId(@HeaderMap Map<String, String> headers, @Body NewsContentGetAllWithSimilarIdRequest request);

    @POST("api/newsContent/add/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsContentAddRequest request);

    @PUT("api/newsContent/edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsContentEditRequest request);

    @DELETE("api/newsContent/delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsContentDeleteRequest request);

    @POST("api/newsContent/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/newsContent/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
