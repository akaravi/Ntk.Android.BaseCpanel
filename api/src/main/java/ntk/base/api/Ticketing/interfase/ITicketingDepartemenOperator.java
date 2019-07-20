package ntk.base.api.Ticketing.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Ticketing.model.TicketingDepartemenOperatorAddRequest;
import ntk.base.api.Ticketing.model.TicketingDepartemenOperatorGetAllOperatorRequest;
import ntk.base.api.Ticketing.model.TicketingDepartemenOperatorResponse;
import ntk.base.api.Ticketing.model.TicketingGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ITicketingDepartemenOperator {

    @POST("api/TicketingDepartemenoperator/getall/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenOperatorResponse> GetAll(@HeaderMap Map<String, String> headers, @Body TicketingGetAllRequest request);

    @POST("api/TicketingDepartemenoperator/getAlloperator/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenOperatorResponse> GetAllOperator(@HeaderMap Map<String, String> headers, @Body TicketingDepartemenOperatorGetAllOperatorRequest request);

    @GET("api/TicketingDepartemenoperator/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenOperatorResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/TicketingDepartemenoperator/add/")
    @Headers({"content-type: application/json"})
    Observable<TicketingDepartemenOperatorResponse> Add(@HeaderMap Map<String, String> headers, @Body TicketingDepartemenOperatorAddRequest request);
}