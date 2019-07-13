package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationGetAllRequest;
import ntk.base.api.application.model.ApplicationLayoutAddRequest;
import ntk.base.api.application.model.ApplicationLayoutDeleteRequest;
import ntk.base.api.application.model.ApplicationLayoutEditRequest;
import ntk.base.api.application.model.ApplicationLayoutResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IApplicationLayout {

    @POST("api/ApplicationLayout/getall/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ApplicationGetAllRequest request);

    @GET("api/ApplicationLayout/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ApplicationLayout/add/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutResponse> Add(@HeaderMap Map<String, String> headers, @Body ApplicationLayoutAddRequest request);

    @PUT("api/ApplicationLayout/edit/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutResponse> Edit(@HeaderMap Map<String, String> headers, @Body ApplicationLayoutEditRequest request);

    @DELETE("api/ApplicationLayout/delete/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLayoutResponse> Delete(@HeaderMap Map<String, String> headers, @Body ApplicationLayoutDeleteRequest request);
}
