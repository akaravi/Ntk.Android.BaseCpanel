package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleContentSimilarAddBatchRequest;
import ntk.base.api.article.model.ArticleContentSimilarDeleteListRequest;
import ntk.base.api.article.model.ArticleContentSimilarResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IArticleContentSimilar {

    @DELETE("api/articleContentSimilar/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentSimilarResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body ArticleContentSimilarDeleteListRequest request);

    @POST("api/articleContentSimilar/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentSimilarResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body ArticleContentSimilarAddBatchRequest request);
}
