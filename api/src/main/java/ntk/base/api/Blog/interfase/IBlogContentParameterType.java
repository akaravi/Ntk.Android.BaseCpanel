package ntk.base.api.Blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Blog.model.BlogContentParameterTypeAddRequest;
import ntk.base.api.Blog.model.BlogContentParameterTypeDeleteRequest;
import ntk.base.api.Blog.model.BlogContentParameterTypeEditRequest;
import ntk.base.api.Blog.model.BlogContentParameterTypeResponse;
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

public interface IBlogContentParameterType {

    @POST("api/BlogContentParameterType/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterTypeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogContentParameterType/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterTypeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogContentParameterType/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterTypeResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogContentParameterTypeAddRequest request);

    @PUT("api/BlogContentParameterType/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterTypeResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogContentParameterTypeEditRequest request);

    @DELETE("api/BlogContentParameterType/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterTypeResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogContentParameterTypeDeleteRequest request);

    @POST("api/BlogContentParameterType/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterTypeResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BlogExportFileRequest request);

    @POST("api/BlogContentParameterType/count/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentParameterTypeResponse> Count(@HeaderMap Map<String, String> headers, @Body BlogCountRequest request);
}
