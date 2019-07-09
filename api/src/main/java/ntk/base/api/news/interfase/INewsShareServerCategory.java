package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCountRequest;
import ntk.base.api.news.model.NewsExportFileRequest;
import ntk.base.api.news.model.NewsGetAllRequest;
import ntk.base.api.news.model.NewsShareServerCategoryAddRequest;
import ntk.base.api.news.model.NewsShareServerCategoryDeleteRequest;
import ntk.base.api.news.model.NewsShareServerCategoryEditRequest;
import ntk.base.api.news.model.NewsShareServerCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsShareServerCategory {

    @POST("api/newsShareServerCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareServerCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/newsShareServerCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareServerCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/newsShareServerCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareServerCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsShareServerCategoryAddRequest request);

    @PUT("api/newsShareServerCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareServerCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsShareServerCategoryEditRequest request);

    @DELETE("api/newsShareServerCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareServerCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsShareServerCategoryDeleteRequest request);

    @POST("api/newsShareServerCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareServerCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/newsShareServerCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareServerCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
