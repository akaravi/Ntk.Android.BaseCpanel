package ntk.base.api.ticketing.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.file.model.FileCountRequest;
import ntk.base.api.file.model.FileExportFileRequest;
import ntk.base.api.ticketing.model.TicketingFaqAddRequest;
import ntk.base.api.ticketing.model.TicketingFaqDeleteRequest;
import ntk.base.api.ticketing.model.TicketingFaqEditRequest;
import ntk.base.api.ticketing.model.TicketingFaqResponse;
import ntk.base.api.ticketing.model.TicketingGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ITicketingFaq {

    @POST("api/TicketingFaq/getall/")
    @Headers({"content-type: application/json"})
    Observable<TicketingFaqResponse> GetAll(@HeaderMap Map<String, String> headers, @Body TicketingGetAllRequest request);

    @GET("api/TicketingFaq/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<TicketingFaqResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/TicketingFaq/add/")
    @Headers({"content-type: application/json"})
    Observable<TicketingFaqResponse> Add(@HeaderMap Map<String, String> headers, @Body TicketingFaqAddRequest request);

    @PUT("api/TicketingFaq/edit/")
    @Headers({"content-type: application/json"})
    Observable<TicketingFaqResponse> Edit(@HeaderMap Map<String, String> headers, @Body TicketingFaqEditRequest request);

    @DELETE("api/TicketingFaq/delete/")
    @Headers({"content-type: application/json"})
    Observable<TicketingFaqResponse> Delete(@HeaderMap Map<String, String> headers, @Body TicketingFaqDeleteRequest request);

    @POST("api/TicketingFaq/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<TicketingFaqResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body FileExportFileRequest request);

    @POST("api/TicketingFaq/count/")
    @Headers({"content-type: application/json"})
    Observable<TicketingFaqResponse> Count(@HeaderMap Map<String, String> headers, @Body FileCountRequest request);
}
