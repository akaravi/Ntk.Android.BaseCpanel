package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyContentSimilarAddBatchRequest;
import ntk.base.api.biography.model.BiographyContentSimilarDeleteListRequest;
import ntk.base.api.biography.model.BiographyContentSimilarResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IBiographyContentSimilar {

    @DELETE("api/BiographyContentSimilar/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentSimilarResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body BiographyContentSimilarDeleteListRequest request);

    @POST("api/BiographyContentSimilar/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentSimilarResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body BiographyContentSimilarAddBatchRequest request);
}
