package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleContentTagAddBatchRequest;
import ntk.base.api.article.model.ArticleContentTagAddRequest;
import ntk.base.api.article.model.ArticleContentTagDeleteListRequest;
import ntk.base.api.article.model.ArticleContentTagDeleteRequest;
import ntk.base.api.article.model.ArticleContentTagEditRequest;
import ntk.base.api.article.model.ArticleContentTagResponse;
import ntk.base.api.article.model.ArticleGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleContentTag {

    @POST("api/articleContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleContentTag/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleContentTagAddRequest request);

    @PUT("api/articleContentTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleContentTagEditRequest request);

    @DELETE("api/articleContentTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleContentTagDeleteRequest request);

    @DELETE("api/articleContentTag/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentTagResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body ArticleContentTagDeleteListRequest request);

    @POST("api/articleContentTag/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentTagResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body ArticleContentTagAddBatchRequest request);
}