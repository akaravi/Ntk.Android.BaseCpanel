package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCountRequest;
import ntk.base.api.news.model.NewsExportFileRequest;
import ntk.base.api.news.model.NewsGetAllRequest;
import ntk.base.api.news.model.NewsShareReciverCategoryAddRequest;
import ntk.base.api.news.model.NewsShareReciverCategoryDeleteRequest;
import ntk.base.api.news.model.NewsShareReciverCategoryEditRequest;
import ntk.base.api.news.model.NewsShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsShareReciverCategory {

    @POST("api/newsShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/newsShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/newsShareReciverCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsShareReciverCategoryAddRequest request);

    @PUT("api/newsShareReciverCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsShareReciverCategoryEditRequest request);

    @DELETE("api/newsShareReciverCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsShareReciverCategoryDeleteRequest request);

    @POST("api/newsShareReciverCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareReciverCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/newsShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
