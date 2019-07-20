package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCategoryAddRequest;
import ntk.base.api.article.model.ArticleCategoryArticleCategoryRequest;
import ntk.base.api.article.model.ArticleCategoryDeleteRequest;
import ntk.base.api.article.model.ArticleCategoryEditRequest;
import ntk.base.api.article.model.ArticleCategoryResponse;
import ntk.base.api.article.model.ArticleGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleCategory {

    @POST("api/articleCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleCategoryAddRequest request);

    @PUT("api/articleCategory/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryResponse> ArticleCategory(@HeaderMap Map<String, String> headers, @Body ArticleCategoryArticleCategoryRequest request);

    @PUT("api/articleCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleCategoryEditRequest request);

    @DELETE("api/articleCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleCategoryDeleteRequest request);
}

