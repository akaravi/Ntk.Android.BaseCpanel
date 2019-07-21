package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateGetAllRequest;
import ntk.base.api.estate.model.EstatePropertyDetailGroupAddRequest;
import ntk.base.api.estate.model.EstatePropertyDetailGroupDeleteRequest;
import ntk.base.api.estate.model.EstatePropertyDetailGroupEditRequest;
import ntk.base.api.estate.model.EstatePropertyDetailGroupResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IEstatePropertyDetailGroup {

    @POST("api/EstatePropertyDetailGroup/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailGroupResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstatePropertyDetailGroup/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailGroupResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstatePropertyDetailGroup/Add/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailGroupResponse> Add(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailGroupAddRequest request);

    @PUT("api/EstatePropertyDetailGroup/Edit/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailGroupResponse> Edit(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailGroupEditRequest request);

    @DELETE("api/EstatePropertyDetailGroup/Delete/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailGroupResponse> Delete(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailGroupDeleteRequest request);
}
