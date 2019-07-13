package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationLayoutValueAddRequest;
import ntk.base.api.application.model.ApplicationLayoutValueEditRequest;
import ntk.base.api.application.model.ApplicationLayoutValueGetOneRequest;
import ntk.base.api.application.model.ApplicationLayoutValueResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IApplicationLayoutValue {

    @GET("api/ApplicationLayoutValue/getone/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutValueResponse> GetOne(@HeaderMap Map<String, String> headers, @Body ApplicationLayoutValueGetOneRequest request);

    @POST("api/ApplicationLayoutValue/add/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutValueResponse> Add(@HeaderMap Map<String, String> headers, @Body ApplicationLayoutValueAddRequest request);

    @PUT("api/ApplicationLayoutValue/edit/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutValueResponse> Edit(@HeaderMap Map<String, String> headers, @Body ApplicationLayoutValueEditRequest request);
}
