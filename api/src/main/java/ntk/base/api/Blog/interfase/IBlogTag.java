package ntk.base.api.Blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Blog.model.BlogCountRequest;
import ntk.base.api.Blog.model.BlogExportFileRequest;
import ntk.base.api.Blog.model.BlogGetAllRequest;
import ntk.base.api.Blog.model.BlogTagAddRequest;
import ntk.base.api.Blog.model.BlogTagDeleteRequest;
import ntk.base.api.Blog.model.BlogTagEditRequest;
import ntk.base.api.Blog.model.BlogTagResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogTag {

    @POST("api/BlogTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogTag/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogTagResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogTagAddRequest request);

    @PUT("api/BlogTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogTagEditRequest request);

    @DELETE("api/BlogTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogTagDeleteRequest request);

    @POST("api/BlogTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BlogTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BlogExportFileRequest request);

    @POST("api/BlogTag/count/")
    @Headers({"content-type: application/json"})
    Observable<BlogTagResponse> Count(@HeaderMap Map<String, String> headers, @Body BlogCountRequest request);
}
