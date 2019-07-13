package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationCountRequest;
import ntk.base.api.application.model.ApplicationExportFileRequest;
import ntk.base.api.application.model.ApplicationGetAllRequest;
import ntk.base.api.application.model.ApplicationMemberInfoAddRequest;
import ntk.base.api.application.model.ApplicationMemberInfoDeleteRequest;
import ntk.base.api.application.model.ApplicationMemberInfoEditRequest;
import ntk.base.api.application.model.ApplicationMemberInfoResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IApplicationMemberInfo {

    @POST("api/ApplicationMemberInfo/getall/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationMemberInfoResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ApplicationGetAllRequest request);

    @POST("api/ApplicationMemberInfo/add/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationMemberInfoResponse> Add(@HeaderMap Map<String, String> headers, @Body ApplicationMemberInfoAddRequest request);

    @PUT("api/ApplicationMemberInfo/edit/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationMemberInfoResponse> Edit(@HeaderMap Map<String, String> headers, @Body ApplicationMemberInfoEditRequest request);

    @DELETE("api/ApplicationMemberInfo/delete/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationMemberInfoResponse> Delete(@HeaderMap Map<String, String> headers, @Body ApplicationMemberInfoDeleteRequest request);

    @POST("api/ApplicationMemberInfo/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationMemberInfoResponse> exportFile(@HeaderMap Map<String, String> headers, @Body ApplicationExportFileRequest request);

    @POST("api/ApplicationMemberInfo/count/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationMemberInfoResponse> Count(@HeaderMap Map<String, String> headers, @Body ApplicationCountRequest request);
}
