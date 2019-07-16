package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModuleSaleSerialAddRequest;
import ntk.base.api.core.model.CoreModuleSaleSerialCheckUseSerialForSiteRequest;
import ntk.base.api.core.model.CoreModuleSaleSerialDeleteRequest;
import ntk.base.api.core.model.CoreModuleSaleSerialEditRequest;
import ntk.base.api.core.model.CoreModuleSaleSerialResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSaleSerial {

    @POST("api/CoreModuleSaleSerial/CheckUseSerialForSite/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> CheckUseSerialForSite(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleSerialCheckUseSerialForSiteRequest request);

    @POST("api/CoreModuleSaleSerial/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreModuleSaleSerial/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleSaleSerial/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleSerialAddRequest request);

    @PUT("api/CoreModuleSaleSerial/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleSerialEditRequest request);

    @DELETE("api/CoreModuleSaleSerial/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleSerialDeleteRequest request);

    @POST("api/CoreModuleSaleSerial/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreModuleSaleSerial/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleSerialResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
