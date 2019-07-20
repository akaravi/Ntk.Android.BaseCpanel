package ntk.base.api.Blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Blog.model.BlogCountRequest;
import ntk.base.api.Blog.model.BlogExportFileRequest;
import ntk.base.api.Blog.model.BlogGetAllRequest;
import ntk.base.api.Blog.model.BlogShareReciverCategoryAddRequest;
import ntk.base.api.Blog.model.BlogShareReciverCategoryDeleteRequest;
import ntk.base.api.Blog.model.BlogShareReciverCategoryEditRequest;
import ntk.base.api.Blog.model.BlogShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogShareReciverCategory {

    @POST("api/BlogShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogShareReciverCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogShareReciverCategoryAddRequest request);

    @PUT("api/BlogShareReciverCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogShareReciverCategoryEditRequest request);

    @DELETE("api/BlogShareReciverCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogShareReciverCategoryDeleteRequest request);

    @POST("api/BlogShareReciverCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareReciverCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BlogExportFileRequest request);

    @POST("api/BlogShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body BlogCountRequest request);
}
