package ntk.base.api.polling.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.polling.model.PollingCountRequest;
import ntk.base.api.polling.model.PollingExportFileRequest;
import ntk.base.api.polling.model.PollingGetAllRequest;
import ntk.base.api.polling.model.PollingOptionAddRequest;
import ntk.base.api.polling.model.PollingOptionDeleteRequest;
import ntk.base.api.polling.model.PollingOptionEditRequest;
import ntk.base.api.polling.model.PollingOptionResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IPollingOption {

    @POST("api/PollingOption/getall/")
    @Headers({"content-type: application/json"})
    Observable<PollingOptionResponse> GetAll(@HeaderMap Map<String, String> headers, @Body PollingGetAllRequest request);

    @GET("api/PollingOption/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<PollingOptionResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/PollingOption/add/")
    @Headers({"content-type: application/json"})
    Observable<PollingOptionResponse> Add(@HeaderMap Map<String, String> headers, @Body PollingOptionAddRequest request);

    @PUT("api/PollingOption/edit/")
    @Headers({"content-type: application/json"})
    Observable<PollingOptionResponse> Edit(@HeaderMap Map<String, String> headers, @Body PollingOptionEditRequest request);

    @DELETE("api/PollingOption/delete/")
    @Headers({"content-type: application/json"})
    Observable<PollingOptionResponse> Delete(@HeaderMap Map<String, String> headers, @Body PollingOptionDeleteRequest request);

    @POST("api/PollingOption/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<PollingOptionResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body PollingExportFileRequest request);

    @POST("api/PollingOption/count/")
    @Headers({"content-type: application/json"})
    Observable<PollingOptionResponse> Count(@HeaderMap Map<String, String> headers, @Body PollingCountRequest request);
}

