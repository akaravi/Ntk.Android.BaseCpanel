package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateContractTypeAddRequest;
import ntk.base.api.estate.model.EstateContractTypeDeleteRequest;
import ntk.base.api.estate.model.EstateContractTypeEditRequest;
import ntk.base.api.estate.model.EstateContractTypeResponse;
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

public interface IEstateContractType {

    @POST("api/EstateContractType/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractTypeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstateContractType/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractTypeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstateContractType/Add/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractTypeResponse> Add(@HeaderMap Map<String, String> headers, @Body EstateContractTypeAddRequest request);

    @PUT("api/EstateContractType/Edit/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractTypeResponse> Edit(@HeaderMap Map<String, String> headers, @Body EstateContractTypeEditRequest request);

    @DELETE("api/EstateContractType/Delete/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractTypeResponse> Delete(@HeaderMap Map<String, String> headers, @Body EstateContractTypeDeleteRequest request);

    @POST("api/EstateContractType/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractTypeResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body EstateExportFileRequest request);

    @POST("api/EstateContractType/count/")
    @Headers({"content-type: application/json"})
    Observable<EstateContractTypeResponse> Count(@HeaderMap Map<String, String> headers, @Body EstateCountRequest request);
}
