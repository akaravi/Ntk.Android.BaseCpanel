package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreSiteActionPageAddRequest;
import ntk.base.api.core.model.CoreSiteActionPageDeleteRequest;
import ntk.base.api.core.model.CoreSiteActionPageEditRequest;
import ntk.base.api.core.model.CoreSiteActionPageResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSiteActionPage {

    @POST("api/CorePageDependency/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteActionPageResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreSiteActionPage/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteActionPageResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreSiteActionPage/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteActionPageResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreSiteActionPageAddRequest request);

    @PUT("api/CoreSiteActionPage/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteActionPageResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreSiteActionPageEditRequest request);

    @DELETE("api/CoreSiteActionPage/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteActionPageResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreSiteActionPageDeleteRequest request);
}