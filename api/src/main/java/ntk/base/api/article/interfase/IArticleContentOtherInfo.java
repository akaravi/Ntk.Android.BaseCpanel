package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleContentOtherInfoAddBatchRequest;
import ntk.base.api.article.model.ArticleContentOtherInfoDeleteListRequest;
import ntk.base.api.article.model.ArticleContentOtherInfoEditBatchRequest;
import ntk.base.api.article.model.ArticleContentOtherInfoResponse;
import ntk.base.api.article.model.ArticleGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleContentOtherInfo {

    @DELETE("api/articleContentOtherInfo/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentOtherInfoResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body ArticleContentOtherInfoDeleteListRequest request);

    @POST("api/articleContentOtherInfo/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentOtherInfoResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body ArticleContentOtherInfoAddBatchRequest request);

    @POST("api/articleContentOtherInfo/GetAll/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentOtherInfoResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @PUT("api/articleContentOtherInfo/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentOtherInfoResponse> EditBatch(@HeaderMap Map<String, String> headers, @Body ArticleContentOtherInfoEditBatchRequest request);
}
