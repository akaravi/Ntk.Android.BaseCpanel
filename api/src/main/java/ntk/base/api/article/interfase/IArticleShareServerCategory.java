package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCountRequest;
import ntk.base.api.article.model.ArticleExportFileRequest;
import ntk.base.api.article.model.ArticleGetAllRequest;
import ntk.base.api.article.model.ArticleShareServerCategoryAddRequest;
import ntk.base.api.article.model.ArticleShareServerCategoryDeleteRequest;
import ntk.base.api.article.model.ArticleShareServerCategoryEditRequest;
import ntk.base.api.article.model.ArticleShareServerCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleShareServerCategory {

    @POST("api/articleShareServerCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareServerCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleShareServerCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareServerCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleShareServerCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareServerCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleShareServerCategoryAddRequest request);

    @PUT("api/articleShareServerCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareServerCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleShareServerCategoryEditRequest request);

    @DELETE("api/articleShareServerCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareServerCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleShareServerCategoryDeleteRequest request);

    @POST("api/articleShareServerCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareServerCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/articleShareServerCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareServerCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}
