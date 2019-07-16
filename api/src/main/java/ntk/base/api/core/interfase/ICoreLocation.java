package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllLocationTypeRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreLocationAddRequest;
import ntk.base.api.core.model.CoreLocationDeleteRequest;
import ntk.base.api.core.model.CoreLocationEditRequest;
import ntk.base.api.core.model.CoreLocationResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreLocation {

    @POST("api/CoreLocation/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @POST("api/CoreLocation/getalllocationtype/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> GetAllLocationType(@HeaderMap Map<String, String> headers, @Body CoreGetAllLocationTypeRequest request);

    @GET("api/CoreLocation/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreLocation/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreLocationAddRequest request);

    @PUT("api/CoreLocation/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreLocationEditRequest request);

    @DELETE("api/CoreLocation/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreLocationDeleteRequest request);

    @POST("api/CoreLocation/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreLocation/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreLocationResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
