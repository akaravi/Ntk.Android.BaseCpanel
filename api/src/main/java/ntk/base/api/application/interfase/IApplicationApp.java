package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationAppAddRequest;
import ntk.base.api.application.model.ApplicationAppDeleteRequest;
import ntk.base.api.application.model.ApplicationAppEditRequest;
import ntk.base.api.application.model.ApplicationAppGetBuildStatusEnumRequest;
import ntk.base.api.application.model.ApplicationAppResponse;
import ntk.base.api.application.model.ApplicationCountRequest;
import ntk.base.api.application.model.ApplicationExportFileRequest;
import ntk.base.api.application.model.ApplicationGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IApplicationApp {

    @POST("api/ApplicationApp/getall/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ApplicationGetAllRequest request);

    @POST("api/ApplicationApp/getBuildStatusEnum/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> GetBuildStatusEnum(@HeaderMap Map<String, String> headers, @Body ApplicationAppGetBuildStatusEnumRequest request);

    @GET("api/ApplicationApp/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ApplicationApp/add/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> Add(@HeaderMap Map<String, String> headers, @Body ApplicationAppAddRequest request);

    @PUT("api/ApplicationApp/edit/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> Edit(@HeaderMap Map<String, String> headers, @Body ApplicationAppEditRequest request);

    @DELETE("api/ApplicationApp/delete/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> Delete(@HeaderMap Map<String, String> headers, @Body ApplicationAppDeleteRequest request);

    @POST("api/ApplicationApp/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> exportFile(@HeaderMap Map<String, String> headers, @Body ApplicationExportFileRequest request);

    @POST("api/ApplicationApp/count/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> Count(@HeaderMap Map<String, String> headers, @Body ApplicationCountRequest request);

    @GET("api/ApplicationApp/buildApp/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationAppResponse> BuildApp(@HeaderMap Map<String, String> headers);
}
