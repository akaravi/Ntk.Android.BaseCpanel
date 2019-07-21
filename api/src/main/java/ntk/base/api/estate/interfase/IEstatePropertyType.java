package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateCountRequest;
import ntk.base.api.estate.model.EstateExportFileRequest;
import ntk.base.api.estate.model.EstateGetAllRequest;
import ntk.base.api.estate.model.EstatePropertyTypeAddRequest;
import ntk.base.api.estate.model.EstatePropertyTypeDeleteRequest;
import ntk.base.api.estate.model.EstatePropertyTypeEditRequest;
import ntk.base.api.estate.model.EstatePropertyTypeResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IEstatePropertyType {

    @POST("api/EstatePropertyType/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyTypeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstatePropertyType/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyTypeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstatePropertyType/Add/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyTypeResponse> Add(@HeaderMap Map<String, String> headers, @Body EstatePropertyTypeAddRequest request);

    @PUT("api/EstatePropertyType/Edit/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyTypeResponse> Edit(@HeaderMap Map<String, String> headers, @Body EstatePropertyTypeEditRequest request);

    @DELETE("api/EstatePropertyType/Delete/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyTypeResponse> Delete(@HeaderMap Map<String, String> headers, @Body EstatePropertyTypeDeleteRequest request);

    @POST("api/EstatePropertyType/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyTypeResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body EstateExportFileRequest request);

    @POST("api/EstatePropertyType/count/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyTypeResponse> Count(@HeaderMap Map<String, String> headers, @Body EstateCountRequest request);
}

