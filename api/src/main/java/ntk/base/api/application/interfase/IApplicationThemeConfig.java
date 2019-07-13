package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationCountRequest;
import ntk.base.api.application.model.ApplicationExportFileRequest;
import ntk.base.api.application.model.ApplicationGetAllRequest;
import ntk.base.api.application.model.ApplicationThemeConfigAddRequest;
import ntk.base.api.application.model.ApplicationThemeConfigDeleteRequest;
import ntk.base.api.application.model.ApplicationThemeConfigEditRequest;
import ntk.base.api.application.model.ApplicationThemeConfigResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IApplicationThemeConfig {

    @POST("api/ApplicationThemeConfig/getall/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationThemeConfigResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ApplicationGetAllRequest request);

    @GET("api/ApplicationThemeConfig/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationThemeConfigResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ApplicationThemeConfig/add/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationThemeConfigResponse> Add(@HeaderMap Map<String, String> headers, @Body ApplicationThemeConfigAddRequest request);

    @PUT("api/ApplicationThemeConfig/edit/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationThemeConfigResponse> Edit(@HeaderMap Map<String, String> headers, @Body ApplicationThemeConfigEditRequest request);

    @DELETE("api/ApplicationThemeConfig/delete/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationThemeConfigResponse> Delete(@HeaderMap Map<String, String> headers, @Body ApplicationThemeConfigDeleteRequest request);

    @POST("api/ApplicationThemeConfig/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationThemeConfigResponse> exportFile(@HeaderMap Map<String, String> headers, @Body ApplicationExportFileRequest request);

    @POST("api/ApplicationThemeConfig/count/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationThemeConfigResponse> Count(@HeaderMap Map<String, String> headers, @Body ApplicationCountRequest request);
}
