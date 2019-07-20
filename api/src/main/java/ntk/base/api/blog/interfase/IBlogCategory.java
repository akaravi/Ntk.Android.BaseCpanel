package ntk.base.api.blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.blog.model.BlogCategoryAddRequest;
import ntk.base.api.blog.model.BlogCategoryBlogCategoryRequest;
import ntk.base.api.blog.model.BlogCategoryDeleteRequest;
import ntk.base.api.blog.model.BlogCategoryEditRequest;
import ntk.base.api.blog.model.BlogCategoryResponse;
import ntk.base.api.blog.model.BlogGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogCategory {

    @POST("api/BlogCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogCategoryAddRequest request);

    @PUT("api/BlogCategory/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryResponse> BlogCategory(@HeaderMap Map<String, String> headers, @Body BlogCategoryBlogCategoryRequest request);

    @PUT("api/BlogCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogCategoryEditRequest request);

    @DELETE("api/BlogCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogCategoryDeleteRequest request);
}

