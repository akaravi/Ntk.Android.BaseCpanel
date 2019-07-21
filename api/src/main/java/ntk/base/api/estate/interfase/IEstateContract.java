package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateContractAddRequest;
import ntk.base.api.estate.model.EstateContractDeleteRequest;
import ntk.base.api.estate.model.EstateContractEditRequest;
import ntk.base.api.estate.model.EstateContractResponse;
import ntk.base.api.estate.model.EstateCountRequest;
import ntk.base.api.estate.model.EstateExportFileRequest;
import ntk.base.api.estate.model.EstateGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IEstateContract {

    @POST("api/EstateContract/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstateContract/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstateContract/Add/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractResponse> Add(@HeaderMap Map<String, String> headers, @Body EstateContractAddRequest request);

    @PUT("api/EstateContract/Edit/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractResponse> Edit(@HeaderMap Map<String, String> headers, @Body EstateContractEditRequest request);

    @DELETE("api/EstateContract/Delete/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractResponse> Delete(@HeaderMap Map<String, String> headers, @Body EstateContractDeleteRequest request);

    @POST("api/EstateContract/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body EstateExportFileRequest request);

    @POST("api/EstateContract/count/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractResponse> Count(@HeaderMap Map<String, String> headers, @Body EstateCountRequest request);
}
