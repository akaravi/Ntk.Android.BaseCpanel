package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsContentAddBatchRequest;
import ntk.base.api.news.model.NewsContentSimilarDeleteListRequest;
import ntk.base.api.news.model.NewsContentSimilarResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface INewsContentSimilar {

    @DELETE("api/newsContentSimilar/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentSimilarResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body NewsContentSimilarDeleteListRequest request);

    @POST("api/newsContentSimilar/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentSimilarResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body NewsContentAddBatchRequest request);

}
