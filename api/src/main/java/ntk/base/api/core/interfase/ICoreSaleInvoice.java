package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModuleSaleInvoiceAddRequest;
import ntk.base.api.core.model.CoreModuleSaleInvoiceDeleteRequest;
import ntk.base.api.core.model.CoreModuleSaleInvoiceEditRequest;
import ntk.base.api.core.model.CoreModuleSaleInvoiceResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSaleInvoice {

    @POST("api/CoreModuleSaleInvoice/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleInvoiceResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreModuleSaleInvoice/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleInvoiceResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleSaleInvoice/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleInvoiceResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleInvoiceAddRequest request);

    @PUT("api/CoreModuleSaleInvoice/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleInvoiceResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleInvoiceEditRequest request);

    @DELETE("api/CoreModuleSaleInvoice/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleInvoiceResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleInvoiceDeleteRequest request);

    @POST("api/CoreModuleSaleInvoice/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleInvoiceResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreModuleSaleInvoice/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleInvoiceResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
