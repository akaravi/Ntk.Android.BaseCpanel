package ntk.base.api.polling.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.polling.model.PollingCategoryAddRequest;
import ntk.base.api.polling.model.PollingCategoryDeleteRequest;
import ntk.base.api.polling.model.PollingCategoryEditRequest;
import ntk.base.api.polling.model.PollingCategoryPollingCategoryRequest;
import ntk.base.api.polling.model.PollingCategoryResponse;
import ntk.base.api.polling.model.PollingGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IPollingCategory {

    @POST("api/PollingCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<PollingCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body PollingGetAllRequest request);

    @GET("api/PollingCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<PollingCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/PollingCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<PollingCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body PollingCategoryAddRequest request);

    @PUT("api/PollingCategory/")
    @Headers({"content-type: application/json"})
    Observable<PollingCategoryResponse> PollingCategory(@HeaderMap Map<String, String> headers, @Body PollingCategoryPollingCategoryRequest request);

    @PUT("api/PollingCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<PollingCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body PollingCategoryEditRequest request);

    @DELETE("api/PollingCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<PollingCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body PollingCategoryDeleteRequest request);
}
