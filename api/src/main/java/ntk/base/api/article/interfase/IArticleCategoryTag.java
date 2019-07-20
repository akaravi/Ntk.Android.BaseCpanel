package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCategoryTagAddRequest;
import ntk.base.api.article.model.ArticleCategoryTagDeleteRequest;
import ntk.base.api.article.model.ArticleCategoryTagEditRequest;
import ntk.base.api.article.model.ArticleCategoryTagResponse;
import ntk.base.api.article.model.ArticleGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleCategoryTag {


    @POST("api/articleCategoryTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleCategoryTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleCategoryTag/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryTagResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleCategoryTagAddRequest request);

    @PUT("api/articleCategoryTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleCategoryTagEditRequest request);

    @DELETE("api/articleCategoryTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCategoryTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleCategoryTagDeleteRequest request);
}

