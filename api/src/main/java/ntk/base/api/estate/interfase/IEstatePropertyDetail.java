package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateGetAllRequest;
import ntk.base.api.estate.model.EstatePropertyDetailAddBatchRequest;
import ntk.base.api.estate.model.EstatePropertyDetailDeleteListRequest;
import ntk.base.api.estate.model.EstatePropertyDetailEditBatchRequest;
import ntk.base.api.estate.model.EstatePropertyDetailResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IEstatePropertyDetail {

    @POST("api/EstatePropertyDetail/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstatePropertyDetail/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstatePropertyDetail/AddBatch/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailAddBatchRequest request);

    @PUT("api/EstatePropertyDetail/EditBatch/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailResponse> EditBatch(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailEditBatchRequest request);

    @DELETE("api/EstatePropertyDetail/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailDeleteListRequest request);
}
