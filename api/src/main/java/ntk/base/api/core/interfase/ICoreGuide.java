package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreGuideAddRequest;
import ntk.base.api.core.model.CoreGuideDeleteRequest;
import ntk.base.api.core.model.CoreGuideEditRequest;
import ntk.base.api.core.model.CoreGuideResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreGuide {

    @POST("api/CoreGuide/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreGuideResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreGuide/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreGuideResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreGuide/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreGuideResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreGuideAddRequest request);

    @PUT("api/CoreGuide/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreGuideResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreGuideEditRequest request);

    @DELETE("api/CoreGuide/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreGuideResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreGuideDeleteRequest request);
}
