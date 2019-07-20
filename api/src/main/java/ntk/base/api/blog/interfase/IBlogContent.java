package ntk.base.api.blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.blog.model.BlogContentAddRequest;
import ntk.base.api.blog.model.BlogContentDeleteRequest;
import ntk.base.api.blog.model.BlogContentEditRequest;
import ntk.base.api.blog.model.BlogContentResponse;
import ntk.base.api.blog.model.BlogCountRequest;
import ntk.base.api.blog.model.BlogExportFileRequest;
import ntk.base.api.blog.model.BlogGetAllRequest;
import ntk.base.api.blog.model.BlogGetAllWithSimilarsIdRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogContent {

    @POST("api/BlogContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @POST("api/BlogContent/GetAllWithSimilarsId/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> GetAllWithSimilarsId(@HeaderMap Map<String, String> headers, @Body BlogGetAllWithSimilarsIdRequest request);

    @GET("api/BlogContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogContent/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogContentAddRequest request);

    @PUT("api/BlogContent/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogContentEditRequest request);

    @DELETE("api/BlogContent/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogContentDeleteRequest request);

    @POST("api/BlogContent/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body BlogExportFileRequest request);

    @POST("api/BlogContent/count/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentResponse> Count(@HeaderMap Map<String, String> headers, @Body BlogCountRequest request);
}

