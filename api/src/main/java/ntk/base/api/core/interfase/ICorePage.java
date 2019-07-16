package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CorePageAddRequest;
import ntk.base.api.core.model.CorePageDeleteRequest;
import ntk.base.api.core.model.CorePageEditRequest;
import ntk.base.api.core.model.CorePageGetAllEnumActionRequest;
import ntk.base.api.core.model.CorePageResponse;
import ntk.base.api.core.model.CoreUtilityToolsRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICorePage {

    @POST("api/CorePage/GetAllEnumAction/")
    @Headers({"content-type: application/json"})
    Observable<CorePageResponse> GetAllEnumAction(@HeaderMap Map<String, String> headers, @Body CorePageGetAllEnumActionRequest request);

    @POST("api/CoreModuleSite/UtilityTools/")
    @Headers({"content-type: application/json"})
    Observable<CorePageResponse> UtilityTools(@HeaderMap Map<String, String> headers, @Body CoreUtilityToolsRequest request);

    @GET("api/CoreModuleSite/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CorePageResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleSite/add/")
    @Headers({"content-type: application/json"})
    Observable<CorePageResponse> Add(@HeaderMap Map<String, String> headers, @Body CorePageAddRequest request);

    @PUT("api/CoreModuleSite/edit/")
    @Headers({"content-type: application/json"})
    Observable<CorePageResponse> Edit(@HeaderMap Map<String, String> headers, @Body CorePageEditRequest request);

    @DELETE("api/CoreModuleSite/delete/")
    @Headers({"content-type: application/json"})
    Observable<CorePageResponse> Delete(@HeaderMap Map<String, String> headers, @Body CorePageDeleteRequest request);
}
