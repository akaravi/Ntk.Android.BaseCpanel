package ntk.base.api.blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.blog.model.BlogContentTagAddRequest;
import ntk.base.api.blog.model.BlogContentTagDeleteRequest;
import ntk.base.api.blog.model.BlogContentTagEditRequest;
import ntk.base.api.blog.model.BlogContentTagResponse;
import ntk.base.api.blog.model.BlogGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogContentTag {

    @POST("api/BlogContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogContentTag/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogContentTagAddRequest request);

    @PUT("api/BlogContentTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogContentTagEditRequest request);

    @DELETE("api/BlogContentTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogContentTagDeleteRequest request);
}