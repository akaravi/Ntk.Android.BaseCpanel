package ntk.base.api.Blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Blog.model.BlogContentParameterAddRequest;
import ntk.base.api.Blog.model.BlogContentParameterDeleteRequest;
import ntk.base.api.Blog.model.BlogContentParameterEditRequest;
import ntk.base.api.Blog.model.BlogContentParameterResponse;
import ntk.base.api.Blog.model.BlogCountRequest;
import ntk.base.api.Blog.model.BlogExportFileRequest;
import ntk.base.api.Blog.model.BlogGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogContentParameter {

    @POST("api/BlogContentParameter/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogContentParameter/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogContentParameter/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogContentParameterAddRequest request);

    @PUT("api/BlogContentParameter/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogContentParameterEditRequest request);

    @DELETE("api/BlogContentParameter/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogContentParameterDeleteRequest request);

    @POST("api/BlogContentParameter/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BlogExportFileRequest request);

    @POST("api/BlogContentParameter/count/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterResponse> Count(@HeaderMap Map<String, String> headers, @Body BlogCountRequest request);
}
