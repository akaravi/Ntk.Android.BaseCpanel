package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyContentOtherInfoAddBatchRequest;
import ntk.base.api.biography.model.BiographyContentOtherInfoDeleteListRequest;
import ntk.base.api.biography.model.BiographyContentOtherInfoEditBatchRequest;
import ntk.base.api.biography.model.BiographyContentOtherInfoResponse;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyContentOtherInfo {

    @DELETE("api/BiographyContentOtherInfo/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentOtherInfoResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body BiographyContentOtherInfoDeleteListRequest request);

    @POST("api/BiographyContentOtherInfo/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentOtherInfoResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body BiographyContentOtherInfoAddBatchRequest request);

    @POST("api/BiographyContentOtherInfo/GetAll/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentOtherInfoResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @PUT("api/BiographyContentOtherInfo/editbatch/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentOtherInfoResponse> EditBatch(@HeaderMap Map<String, String> headers, @Body BiographyContentOtherInfoEditBatchRequest request);
}
