package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModuleProcessAutoAddRequest;
import ntk.base.api.core.model.CoreModuleProcessResponse;
import ntk.base.api.core.model.CoreProcessAddRequest;
import ntk.base.api.core.model.CoreProcessDeleteRequest;
import ntk.base.api.core.model.CoreProcessEditRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreProcess {

    @POST("api/CoreModuleProcess/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreModuleProcess/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleProcess/AutoAdd/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessResponse> AutoAdd(@HeaderMap Map<String, String> headers, @Body CoreModuleProcessAutoAddRequest request);

    @POST("api/CoreModuleProcess/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreProcessAddRequest request);

    @PUT("api/CoreModuleProcess/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreProcessEditRequest request);

    @DELETE("api/CoreModuleProcess/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreProcessDeleteRequest request);

    @POST("api/CoreModuleProcess/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleProcessResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
