package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreUserAddRequest;
import ntk.base.api.core.model.CoreUserDeleteRequest;
import ntk.base.api.core.model.CoreUserEditRequest;
import ntk.base.api.core.model.CoreUserGetActivationCodeRequest;
import ntk.base.api.core.model.CoreUserGetAreaTypeRequest;
import ntk.base.api.core.model.CoreUserResponse;
import ntk.base.api.core.model.CoreUserSelectCurrentSiteRequest;
import ntk.base.api.core.model.CoreUserloginRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreUser {

    @POST("api/CoreUser/getAllGender/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> GetAllGender(@HeaderMap Map<String, String> headers, @Body CoreUserGetAreaTypeRequest request);

    @POST("api/CoreUser/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreUser/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreUser/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreUserAddRequest request);

    @PUT("api/CoreUser/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreUserEditRequest request);

    @DELETE("api/CoreUser/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreUserDeleteRequest request);

    @POST("api/CoreUser/SelectCurrentSite/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> SelectCurrentSite(@HeaderMap Map<String, String> headers, @Body CoreUserSelectCurrentSiteRequest request);

    @POST("api/CoreUser/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreUser/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);

    @POST("api/CoreUser/userlogin/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> UserLogin(@HeaderMap Map<String, String> headers, @Body CoreUserloginRequest request);

    @POST("api/CoreUser/getActivationCode/")
    @Headers({"content-type: application/json"})
    Observable<CoreUserResponse> GetActivationCode(@HeaderMap Map<String, String> headers, @Body CoreUserGetActivationCodeRequest request);
}