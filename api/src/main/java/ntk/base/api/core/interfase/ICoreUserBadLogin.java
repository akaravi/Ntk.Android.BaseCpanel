package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreUserBadLoginAddRequest;
import ntk.base.api.core.model.CoreUserBadLoginDeleteRequest;
import ntk.base.api.core.model.CoreUserBadLoginEditRequest;
import ntk.base.api.core.model.CoreUserBadLoginResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreUserBadLogin {

    @POST("api/CoreUserBadLogin/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserBadLoginResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreUserBadLogin/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserBadLoginResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreUserBadLogin/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserBadLoginResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreUserBadLoginAddRequest request);

    @PUT("api/CoreUserBadLogin/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserBadLoginResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreUserBadLoginEditRequest request);

    @DELETE("api/CoreUserBadLogin/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserBadLoginResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreUserBadLoginDeleteRequest request);

    @POST("api/CoreUserBadLogin/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserBadLoginResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreUserBadLogin/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserBadLoginResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
