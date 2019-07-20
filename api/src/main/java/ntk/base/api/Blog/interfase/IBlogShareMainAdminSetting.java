package ntk.base.api.Blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Blog.model.BlogGetAllRequest;
import ntk.base.api.Blog.model.BlogShareMainAdminSettingAddRequest;
import ntk.base.api.Blog.model.BlogShareMainAdminSettingDeleteRequest;
import ntk.base.api.Blog.model.BlogShareMainAdminSettingEditRequest;
import ntk.base.api.Blog.model.BlogShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogShareMainAdminSetting {

    @POST("api/BlogShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BlogGetAllRequest request);

    @GET("api/BlogShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BlogShareMainAdminSetting/add/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body BlogShareMainAdminSettingAddRequest request);

    @PUT("api/BlogShareMainAdminSetting/edit/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body BlogShareMainAdminSettingEditRequest request);

    @DELETE("api/BlogShareMainAdminSetting/delete/")
    @Headers({"content-type: application/json"})
    Observable<BlogShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body BlogShareMainAdminSettingDeleteRequest request);
}