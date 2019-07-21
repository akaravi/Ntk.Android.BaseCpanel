package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateCountRequest;
import ntk.base.api.estate.model.EstateExportFileRequest;
import ntk.base.api.estate.model.EstateGetAllRequest;
import ntk.base.api.estate.model.EstatePropertyAddRequest;
import ntk.base.api.estate.model.EstatePropertyDeleteRequest;
import ntk.base.api.estate.model.EstatePropertyEditRequest;
import ntk.base.api.estate.model.EstatePropertyGetAllWithAliasRequest;
import ntk.base.api.estate.model.EstatePropertyResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IEstateProperty {

    @POST("api/EstateProperty/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstateProperty/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstateProperty/getAllwithalias/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> GetAllWithAlias(@HeaderMap Map<String, String> headers, @Body EstatePropertyGetAllWithAliasRequest request);

    @POST("api/EstateProperty/Add/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> Add(@HeaderMap Map<String, String> headers, @Body EstatePropertyAddRequest request);

    @PUT("api/EstateProperty/Edit/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> Edit(@HeaderMap Map<String, String> headers, @Body EstatePropertyEditRequest request);

    @DELETE("api/EstateProperty/Delete/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> Delete(@HeaderMap Map<String, String> headers, @Body EstatePropertyDeleteRequest request);

    @POST("api/EstateProperty/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body EstateExportFileRequest request);

    @POST("api/EstateProperty/count/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyResponse> Count(@HeaderMap Map<String, String> headers, @Body EstateCountRequest request);
}

