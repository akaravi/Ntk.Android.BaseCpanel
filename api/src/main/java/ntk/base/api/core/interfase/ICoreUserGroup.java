package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreUserGroupAddRequest;
import ntk.base.api.core.model.CoreUserGroupDeleteRequest;
import ntk.base.api.core.model.CoreUserGroupEditRequest;
import ntk.base.api.core.model.CoreUserGroupGetEnumRequest;
import ntk.base.api.core.model.CoreUserGroupResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreUserGroup {

    @POST("api/CoreUserGroup/getenum/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> GetEnum(@HeaderMap Map<String, String> headers, @Body CoreUserGroupGetEnumRequest request);

    @POST("api/CoreUserGroup/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreUserGroup/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreUserGroup/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreUserGroupAddRequest request);

    @PUT("api/CoreUserGroup/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreUserGroupEditRequest request);

    @DELETE("api/CoreUserGroup/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreUserGroupDeleteRequest request);

    @POST("api/CoreUserGroup/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreUserGroup/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserGroupResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
