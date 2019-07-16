package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModuleSaleHeaderGroupAddRequest;
import ntk.base.api.core.model.CoreModuleSaleHeaderGroupDeleteRequest;
import ntk.base.api.core.model.CoreModuleSaleHeaderGroupEditRequest;
import ntk.base.api.core.model.CoreModuleSaleHeaderGroupResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSaleHeaderGroup {

    @POST("api/CoreModuleSaleHeaderGroup/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleHeaderGroupResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreModuleSaleHeaderGroup/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleHeaderGroupResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleSaleHeaderGroup/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleHeaderGroupResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleHeaderGroupAddRequest request);

    @PUT("api/CoreModuleSaleHeaderGroup/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleHeaderGroupResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleHeaderGroupEditRequest request);

    @DELETE("api/CoreModuleSaleHeaderGroup/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleHeaderGroupResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleHeaderGroupDeleteRequest request);

    @POST("api/CoreModuleSaleHeaderGroup/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleHeaderGroupResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreModuleSaleHeaderGroup/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleHeaderGroupResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
