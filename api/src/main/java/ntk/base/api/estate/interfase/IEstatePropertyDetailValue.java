package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateGetAllRequest;
import ntk.base.api.estate.model.EstatePropertyDetailValueAddBatchRequest;
import ntk.base.api.estate.model.EstatePropertyDetailValueDeleteListRequest;
import ntk.base.api.estate.model.EstatePropertyDetailValueEditBatchRequest;
import ntk.base.api.estate.model.EstatePropertyDetailValueResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IEstatePropertyDetailValue {

    @POST("api/EstatePropertyDetailValue/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailValueResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstatePropertyDetailValue/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailValueResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstatePropertyDetailValue/AddBatch/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailValueResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailValueAddBatchRequest request);

    @PUT("api/EstatePropertyDetailValue/EditBatch/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailValueResponse> EditBatch(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailValueEditBatchRequest request);

    @DELETE("api/EstatePropertyDetailValue/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyDetailValueResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailValueDeleteListRequest request);
}