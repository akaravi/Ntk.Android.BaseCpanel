package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModuleSaleItemAddRequest;
import ntk.base.api.core.model.CoreModuleSaleItemDeleteRequest;
import ntk.base.api.core.model.CoreModuleSaleItemEditRequest;
import ntk.base.api.core.model.CoreModuleSaleItemGetAllEnumCmsModuleSaleItemTypeRequest;
import ntk.base.api.core.model.CoreModuleSaleItemResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSaleItem {

    @POST("api/CoreModuleSaleItem/getAllEnumCmsModuleSaleItemType/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> GetAllEnumCmsModuleSaleItemType(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleItemGetAllEnumCmsModuleSaleItemTypeRequest request);

    @POST("api/CoreModuleSaleItem/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreModuleSaleItem/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleSaleItem/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleItemAddRequest request);

    @PUT("api/CoreModuleSaleItem/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleItemEditRequest request);

    @DELETE("api/CoreModuleSaleItem/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreModuleSaleItemDeleteRequest request);

    @POST("api/CoreModuleSaleItem/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreModuleSaleItem/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreModuleSaleItemResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
