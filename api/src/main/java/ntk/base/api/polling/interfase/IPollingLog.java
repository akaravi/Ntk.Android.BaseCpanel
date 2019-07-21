package ntk.base.api.polling.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.polling.model.PollingCountRequest;
import ntk.base.api.polling.model.PollingExportFileRequest;
import ntk.base.api.polling.model.PollingGetAllRequest;
import ntk.base.api.polling.model.PollingLogAddRequest;
import ntk.base.api.polling.model.PollingLogDeleteRequest;
import ntk.base.api.polling.model.PollingLogEditRequest;
import ntk.base.api.polling.model.PollingLogResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IPollingLog {

    @POST("api/PollingLog/getall/")
    @Headers({"content-type: application/json"})
    Observable<PollingLogResponse> GetAll(@HeaderMap Map<String, String> headers, @Body PollingGetAllRequest request);

    @GET("api/PollingLog/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<PollingLogResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/PollingLog/add/")
    @Headers({"content-type: application/json"})
    Observable<PollingLogResponse> Add(@HeaderMap Map<String, String> headers, @Body PollingLogAddRequest request);

    @PUT("api/PollingLog/edit/")
    @Headers({"content-type: application/json"})
    Observable<PollingLogResponse> Edit(@HeaderMap Map<String, String> headers, @Body PollingLogEditRequest request);

    @DELETE("api/PollingLog/delete/")
    @Headers({"content-type: application/json"})
    Observable<PollingLogResponse> Delete(@HeaderMap Map<String, String> headers, @Body PollingLogDeleteRequest request);

    @POST("api/PollingLog/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<PollingLogResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body PollingExportFileRequest request);

    @POST("api/PollingLog/count/")
    @Headers({"content-type: application/json"})
    Observable<PollingLogResponse> Count(@HeaderMap Map<String, String> headers, @Body PollingCountRequest request);
}
