package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreTokenUserLogAddRequest;
import ntk.base.api.core.model.CoreTokenUserLogDeleteRequest;
import ntk.base.api.core.model.CoreTokenUserLogEditRequest;
import ntk.base.api.core.model.CoreTokenUserLogResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreTokenUserLog {

    @POST("api/CoreTokenUserLog/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserLogResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreTokenUserLog/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserLogResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreTokenUserLog/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserLogResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreTokenUserLogAddRequest request);

    @PUT("api/CoreTokenUserLog/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserLogResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreTokenUserLogEditRequest request);

    @DELETE("api/CoreTokenUserLog/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserLogResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreTokenUserLogDeleteRequest request);

    @POST("api/CoreTokenUserLog/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserLogResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreTokenUserLog/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserLogResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
