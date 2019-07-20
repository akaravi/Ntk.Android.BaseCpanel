package ntk.base.api.blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.blog.model.BlogCategoryTagAddRequest;
import ntk.base.api.blog.model.BlogCategoryTagDeleteRequest;
import ntk.base.api.blog.model.BlogCategoryTagEditRequest;
import ntk.base.api.blog.model.BlogCategoryTagResponse;
import ntk.base.api.blog.model.BlogGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogCategoryTag {


    @POST("api/BlogCategoryTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogCategoryTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogCategoryTag/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryTagResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogCategoryTagAddRequest request);

    @PUT("api/BlogCategoryTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogCategoryTagEditRequest request);

    @DELETE("api/BlogCategoryTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogCategoryTagDeleteRequest request);
}

