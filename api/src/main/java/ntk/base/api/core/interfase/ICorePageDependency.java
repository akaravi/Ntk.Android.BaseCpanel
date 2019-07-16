package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CorePageDependencyAddRequest;
import ntk.base.api.core.model.CorePageDependencyAutoAddRequest;
import ntk.base.api.core.model.CorePageDependencyDeleteRequest;
import ntk.base.api.core.model.CorePageDependencyEditRequest;
import ntk.base.api.core.model.CorePageDependencyResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICorePageDependency {

    @POST("api/CorePageDependency/getall/")
    @Headers({"content-type: application/json"})
    Observable<CorePageDependencyResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @POST("api/CorePageDependency/AutoAdd/")
    @Headers({"content-type: application/json"})
    Observable<CorePageDependencyResponse> AutoAdd(@HeaderMap Map<String, String> headers, @Body CorePageDependencyAutoAddRequest request);

    @GET("api/CorePageDependency/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CorePageDependencyResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CorePageDependency/add/")
    @Headers({"content-type: application/json"})
    Observable<CorePageDependencyResponse> Add(@HeaderMap Map<String, String> headers, @Body CorePageDependencyAddRequest request);

    @PUT("api/CorePageDependency/edit/")
    @Headers({"content-type: application/json"})
    Observable<CorePageDependencyResponse> Edit(@HeaderMap Map<String, String> headers, @Body CorePageDependencyEditRequest request);

    @DELETE("api/CorePageDependency/delete/")
    @Headers({"content-type: application/json"})
    Observable<CorePageDependencyResponse> Delete(@HeaderMap Map<String, String> headers, @Body CorePageDependencyDeleteRequest request);

    @POST("api/CorePageDependency/count/")
    @Headers({"content-type: application/json"})
    Observable<CorePageDependencyResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
