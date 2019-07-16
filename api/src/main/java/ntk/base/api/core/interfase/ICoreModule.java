package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreAddRequest;
import ntk.base.api.core.model.CoreAutoAddRequest;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreDeleteRequest;
import ntk.base.api.core.model.CoreEditRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreGetOneWithModuleConfigRequest;
import ntk.base.api.core.model.CoreModuleResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreModule {

    @POST("api/CoreModule/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @POST("api/CoreModule/AutoAdd/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> AutoAdd(@HeaderMap Map<String, String> headers, @Body CoreAutoAddRequest request);

    @GET("api/CoreModule/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModule/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreAddRequest request);

    @PUT("api/CoreModule/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreEditRequest request);

    @DELETE("api/CoreModule/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreDeleteRequest request);

    @POST("api/CoreModule/GetOneWithModuleConfig/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> GetOneWithModuleConfig(@HeaderMap Map<String, String> headers, @Body CoreGetOneWithModuleConfigRequest request);

    @POST("api/CoreModule/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreModule/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
