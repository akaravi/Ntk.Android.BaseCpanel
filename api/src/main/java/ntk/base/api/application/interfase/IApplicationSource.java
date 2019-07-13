package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationGetAllRequest;
import ntk.base.api.application.model.ApplicationSourceAddRequest;
import ntk.base.api.application.model.ApplicationSourceDeleteRequest;
import ntk.base.api.application.model.ApplicationSourceEditRequest;
import ntk.base.api.application.model.ApplicationSourceResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IApplicationSource {

    @POST("api/ApplicationSource/getall/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationSourceResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ApplicationGetAllRequest request);

    @GET("api/ApplicationSource/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationSourceResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ApplicationSource/add/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationSourceResponse> Add(@HeaderMap Map<String, String> headers, @Body ApplicationSourceAddRequest request);

    @PUT("api/ApplicationSource/edit/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationSourceResponse> Edit(@HeaderMap Map<String, String> headers, @Body ApplicationSourceEditRequest request);

    @DELETE("api/ApplicationSource/delete/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationSourceResponse> Delete(@HeaderMap Map<String, String> headers, @Body ApplicationSourceDeleteRequest request);
}
