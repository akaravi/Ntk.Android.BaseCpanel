package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCountRequest;
import ntk.base.api.article.model.ArticleExportFileRequest;
import ntk.base.api.article.model.ArticleGetAllRequest;
import ntk.base.api.article.model.ArticleShareReciverCategoryAddRequest;
import ntk.base.api.article.model.ArticleShareReciverCategoryDeleteRequest;
import ntk.base.api.article.model.ArticleShareReciverCategoryEditRequest;
import ntk.base.api.article.model.ArticleShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleShareReciverCategory {

    @POST("api/articleShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleShareReciverCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleShareReciverCategoryAddRequest request);

    @PUT("api/articleShareReciverCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleShareReciverCategoryEditRequest request);

    @DELETE("api/articleShareReciverCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleShareReciverCategoryDeleteRequest request);

    @POST("api/articleShareReciverCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareReciverCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/articleShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}
