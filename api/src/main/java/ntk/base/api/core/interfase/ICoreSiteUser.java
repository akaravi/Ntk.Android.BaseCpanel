package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreSiteUserAddRequest;
import ntk.base.api.core.model.CoreSiteUserDeleteRequest;
import ntk.base.api.core.model.CoreSiteUserEditRequest;
import ntk.base.api.core.model.CoreSiteUserResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSiteUser {

    @POST("api/CoreSiteUser/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteUserResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreSiteUser/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteUserResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreSiteUser/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteUserResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreSiteUserAddRequest request);

    @PUT("api/CoreSiteUser/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteUserResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreSiteUserEditRequest request);

    @DELETE("api/CoreSiteUser/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteUserResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreSiteUserDeleteRequest request);
}
