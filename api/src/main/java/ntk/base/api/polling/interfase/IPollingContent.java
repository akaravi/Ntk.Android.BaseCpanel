package ntk.base.api.polling.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.polling.model.PollingContentAddRequest;
import ntk.base.api.polling.model.PollingContentDeleteRequest;
import ntk.base.api.polling.model.PollingContentEditRequest;
import ntk.base.api.polling.model.PollingContentResponse;
import ntk.base.api.polling.model.PollingCountRequest;
import ntk.base.api.polling.model.PollingExportFileRequest;
import ntk.base.api.polling.model.PollingGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IPollingContent {

    @POST("api/PollingContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<PollingContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body PollingGetAllRequest request);

    @GET("api/PollingContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<PollingContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/PollingContent/add/")
    @Headers({"content-type: application/json"})
    Observable<PollingContentResponse> Add(@HeaderMap Map<String, String> headers, @Body PollingContentAddRequest request);

    @PUT("api/PollingContent/edit/")
    @Headers({"content-type: application/json"})
    Observable<PollingContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body PollingContentEditRequest request);

    @DELETE("api/PollingContent/delete/")
    @Headers({"content-type: application/json"})
    Observable<PollingContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body PollingContentDeleteRequest request);

    @POST("api/PollingContent/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<PollingContentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body PollingExportFileRequest request);

    @POST("api/PollingContent/count/")
    @Headers({"content-type: application/json"})
    Observable<PollingContentResponse> Count(@HeaderMap Map<String, String> headers, @Body PollingCountRequest request);
}
