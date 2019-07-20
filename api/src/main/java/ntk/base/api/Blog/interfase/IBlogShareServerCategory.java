package ntk.base.api.Blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Blog.model.BlogCountRequest;
import ntk.base.api.Blog.model.BlogExportFileRequest;
import ntk.base.api.Blog.model.BlogGetAllRequest;
import ntk.base.api.Blog.model.BlogShareServerCategoryAddRequest;
import ntk.base.api.Blog.model.BlogShareServerCategoryDeleteRequest;
import ntk.base.api.Blog.model.BlogShareServerCategoryEditRequest;
import ntk.base.api.Blog.model.BlogShareServerCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogShareServerCategory {

    @POST("api/BlogShareServerCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareServerCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogShareServerCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareServerCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogShareServerCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareServerCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogShareServerCategoryAddRequest request);

    @PUT("api/BlogShareServerCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareServerCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogShareServerCategoryEditRequest request);

    @DELETE("api/BlogShareServerCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareServerCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogShareServerCategoryDeleteRequest request);

    @POST("api/BlogShareServerCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareServerCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BlogExportFileRequest request);

    @POST("api/BlogShareServerCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareServerCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body BlogCountRequest request);
}
