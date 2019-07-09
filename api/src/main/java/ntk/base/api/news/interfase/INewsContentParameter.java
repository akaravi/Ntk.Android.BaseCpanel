package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsContentParameterAddRequest;
import ntk.base.api.news.model.NewsContentParameterDeleteRequest;
import ntk.base.api.news.model.NewsContentParameterEditRequest;
import ntk.base.api.news.model.NewsContentParameterResponse;
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

public interface INewsContentParameter {

    @POST("api/newsContentParameter/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/newsContentParameter/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/newsContentParameter/Add/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsContentParameterAddRequest request);

    @PUT("api/newsContentParameter/Edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsContentParameterEditRequest request);

    @DELETE("api/newsContentParameter/Delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsContentParameterDeleteRequest request);

    @POST("api/newsContentParameter/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/newsContentParameter/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
