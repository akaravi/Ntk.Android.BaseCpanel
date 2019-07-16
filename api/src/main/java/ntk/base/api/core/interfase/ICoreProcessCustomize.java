package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModuleProcessCustomizeAddRequest;
import ntk.base.api.core.model.CoreModuleProcessCustomizeDeleteRequest;
import ntk.base.api.core.model.CoreModuleProcessCustomizeEditRequest;
import ntk.base.api.core.model.CoreModuleProcessCustomizeResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreProcessCustomize {

    @POST("api/CoreModuleProcessCustomize/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessCustomizeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreModuleProcessCustomize/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessCustomizeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleProcessCustomize/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessCustomizeResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreModuleProcessCustomizeAddRequest request);

    @PUT("api/CoreModuleProcessCustomize/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessCustomizeResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreModuleProcessCustomizeEditRequest request);

    @DELETE("api/CoreModuleProcessCustomize/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessCustomizeResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreModuleProcessCustomizeDeleteRequest request);

    @POST("api/CoreModuleProcessCustomize/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessCustomizeResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
