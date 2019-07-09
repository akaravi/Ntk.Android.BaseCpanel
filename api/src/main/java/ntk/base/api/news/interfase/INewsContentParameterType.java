package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsContentParameterTypeAddRequest;
import ntk.base.api.news.model.NewsContentParameterTypeDeleteRequest;
import ntk.base.api.news.model.NewsContentParameterTypeEditRequest;
import ntk.base.api.news.model.NewsContentParameterTypeResponse;
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

public interface INewsContentParameterType {

    @POST("api/newsContentParameterType/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterTypeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/newsContentParameterType/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterTypeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/newsContentParameterType/Add/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterTypeResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsContentParameterTypeAddRequest request);

    @PUT("api/newsContentParameterType/Edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterTypeResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsContentParameterTypeEditRequest request);

    @DELETE("api/newsContentParameterType/Delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterTypeResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsContentParameterTypeDeleteRequest request);

    @POST("api/newsContentParameterType/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterTypeResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/newsContentParameterType/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentParameterTypeResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
