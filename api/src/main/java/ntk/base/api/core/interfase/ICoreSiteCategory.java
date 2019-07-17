package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreSiteCategoryAddRequest;
import ntk.base.api.core.model.CoreSiteCategoryDeleteRequest;
import ntk.base.api.core.model.CoreSiteCategoryEditRequest;
import ntk.base.api.core.model.CoreSiteCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSiteCategory {

    @POST("api/CoreSiteCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreSiteCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreSiteCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreSiteCategoryAddRequest request);

    @PUT("api/CoreSiteCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreSiteCategoryEditRequest request);

    @DELETE("api/CoreSiteCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreSiteCategoryDeleteRequest request);
}
