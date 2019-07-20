package ntk.base.api.Ticketing.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.Ticketing.model.TicketingAnswerAddRequest;
import ntk.base.api.Ticketing.model.TicketingAnswerDeleteRequest;
import ntk.base.api.Ticketing.model.TicketingAnswerEditRequest;
import ntk.base.api.Ticketing.model.TicketingAnswerResponse;
import ntk.base.api.Ticketing.model.TicketingGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ITicketingAnswer {

    @POST("api/TicketingAnswer/getall/")
    @Headers({"content-type: application/json"})
    Observable<TicketingAnswerResponse> GetAll(@HeaderMap Map<String, String> headers, @Body TicketingGetAllRequest request);

    @GET("api/TicketingAnswer/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<TicketingAnswerResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/TicketingAnswer/add/")
    @Headers({"content-type: application/json"})
    Observable<TicketingAnswerResponse> Add(@HeaderMap Map<String, String> headers, @Body TicketingAnswerAddRequest request);

    @PUT("api/TicketingAnswer/edit/")
    @Headers({"content-type: application/json"})
    Observable<TicketingAnswerResponse> Edit(@HeaderMap Map<String, String> headers, @Body TicketingAnswerEditRequest request);

    @DELETE("api/TicketingAnswer/delete/")
    @Headers({"content-type: application/json"})
    Observable<TicketingAnswerResponse> Delete(@HeaderMap Map<String, String> headers, @Body TicketingAnswerDeleteRequest request);
}
