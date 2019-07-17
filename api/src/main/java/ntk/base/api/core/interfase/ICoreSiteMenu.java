package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreSiteMenuAddRequest;
import ntk.base.api.core.model.CoreSiteMenuDeleteRequest;
import ntk.base.api.core.model.CoreSiteMenuEditRequest;
import ntk.base.api.core.model.CoreSiteMenuGetAreaTypeRequest;
import ntk.base.api.core.model.CoreSiteMenuResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSiteMenu {

    @POST("api/CoreSiteMenu/getAreaType/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteMenuResponse> GetAreaType(@HeaderMap Map<String, String> headers, @Body CoreSiteMenuGetAreaTypeRequest request);

    @POST("api/CoreSiteMenu/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteMenuResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreSiteMenu/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteMenuResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreSiteMenu/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteMenuResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreSiteMenuAddRequest request);

    @PUT("api/CoreSiteMenu/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteMenuResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreSiteMenuEditRequest request);

    @DELETE("api/CoreSiteMenu/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteMenuResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreSiteMenuDeleteRequest request);
}
