package ntk.base.api.Ticketing.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Ticketing.model.TicketingGetAllRequest;
import ntk.base.api.Ticketing.model.TicketingTaskAddRequest;
import ntk.base.api.Ticketing.model.TicketingTaskDeleteRequest;
import ntk.base.api.Ticketing.model.TicketingTaskEditRequest;
import ntk.base.api.Ticketing.model.TicketingTaskIsReadRequest;
import ntk.base.api.Ticketing.model.TicketingTaskResponse;
import ntk.base.api.file.model.FileCountRequest;
import ntk.base.api.file.model.FileExportFileRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ITicketingTask {

    @POST("api/TicketingTask/getall/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> GetAll(@HeaderMap Map<String, String> headers, @Body TicketingGetAllRequest request);

    @POST("api/TicketingTask/isRead/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> IsRead(@HeaderMap Map<String, String> headers, @Body TicketingTaskIsReadRequest request);

    @GET("api/TicketingTask/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/TicketingTask/add/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> Add(@HeaderMap Map<String, String> headers, @Body TicketingTaskAddRequest request);

    @PUT("api/TicketingTask/edit/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> Edit(@HeaderMap Map<String, String> headers, @Body TicketingTaskEditRequest request);

    @DELETE("api/TicketingTask/delete/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> Delete(@HeaderMap Map<String, String> headers, @Body TicketingTaskDeleteRequest request);

    @POST("api/TicketingTask/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body FileExportFileRequest request);

    @POST("api/TicketingTask/count/")
    @Headers({"content-type: application/json"})
    Observable<TicketingTaskResponse> Count(@HeaderMap Map<String, String> headers, @Body FileCountRequest request);
}
