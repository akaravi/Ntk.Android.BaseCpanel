package ntk.base.api.blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.blog.model.BlogContentSimilarAddBatchRequest;
import ntk.base.api.blog.model.BlogContentSimilarDeleteListRequest;
import ntk.base.api.blog.model.BlogContentSimilarResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IBlogContentSimilar {

    @DELETE("api/BlogContentSimilar/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentSimilarResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body BlogContentSimilarDeleteListRequest request);

    @POST("api/BlogContentSimilar/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentSimilarResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body BlogContentSimilarAddBatchRequest request);
}
