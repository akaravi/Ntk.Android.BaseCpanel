package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreTokenUserAddRequest;
import ntk.base.api.core.model.CoreTokenUserDeleteRequest;
import ntk.base.api.core.model.CoreTokenUserEditRequest;
import ntk.base.api.core.model.CoreTokenUserResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreTokenUser {

    @POST("api/CoreTokenUser/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreTokenUser/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreTokenUser/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreTokenUserAddRequest request);

    @PUT("api/CoreTokenUser/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreTokenUserEditRequest request);

    @DELETE("api/CoreTokenUser/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreTokenUserDeleteRequest request);

    @POST("api/CoreTokenUser/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreTokenUser/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreTokenUserResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
