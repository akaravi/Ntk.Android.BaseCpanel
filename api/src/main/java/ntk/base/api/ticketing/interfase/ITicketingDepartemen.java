package ntk.base.api.ticketing.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.file.model.FileCountRequest;
import ntk.base.api.file.model.FileExportFileRequest;
import ntk.base.api.ticketing.model.TicketingDepartemenAddRequest;
import ntk.base.api.ticketing.model.TicketingDepartemenDeleteRequest;
import ntk.base.api.ticketing.model.TicketingDepartemenEditRequest;
import ntk.base.api.ticketing.model.TicketingDepartemenGetPriorityEnumRequest;
import ntk.base.api.ticketing.model.TicketingDepartemenResponse;
import ntk.base.api.ticketing.model.TicketingGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ITicketingDepartemen {

    @POST("api/TicketingDepartemen/getall/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> GetAll(@HeaderMap Map<String, String> headers, @Body TicketingGetAllRequest request);

    @POST("api/TicketingDepartemen/GetPriorityEnum/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> GetPriorityEnum(@HeaderMap Map<String, String> headers, @Body TicketingDepartemenGetPriorityEnumRequest request);

    @GET("api/TicketingDepartemen/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/TicketingDepartemen/add/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> Add(@HeaderMap Map<String, String> headers, @Body TicketingDepartemenAddRequest request);

    @PUT("api/TicketingDepartemen/edit/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> Edit(@HeaderMap Map<String, String> headers, @Body TicketingDepartemenEditRequest request);

    @DELETE("api/TicketingDepartemen/delete/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> Delete(@HeaderMap Map<String, String> headers, @Body TicketingDepartemenDeleteRequest request);

    @POST("api/TicketingDepartemen/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body FileExportFileRequest request);

    @POST("api/TicketingDepartemen/count/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenResponse> Count(@HeaderMap Map<String, String> headers, @Body FileCountRequest request);
}
