package ntk.base.api.blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.blog.model.BlogCommentAddRequest;
import ntk.base.api.blog.model.BlogCommentDeleteRequest;
import ntk.base.api.blog.model.BlogCommentEditRequest;
import ntk.base.api.blog.model.BlogCommentResponse;
import ntk.base.api.blog.model.BlogCountRequest;
import ntk.base.api.blog.model.BlogExportFileRequest;
import ntk.base.api.blog.model.BlogGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogComment {

    @POST("api/BlogComment/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogCommentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogComment/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogCommentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogComment/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogCommentResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogCommentAddRequest request);

    @PUT("api/BlogComment/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogCommentResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogCommentEditRequest request);

    @DELETE("api/BlogComment/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogCommentResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogCommentDeleteRequest request);

    @POST("api/BlogComment/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<BlogCommentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body BlogExportFileRequest request);

    @POST("api/BlogComment/count/")
    @Headers({"content-type: application/json"})
    Observable<BlogCommentResponse> Count(@HeaderMap Map<String, String> headers, @Body BlogCountRequest request);
}
