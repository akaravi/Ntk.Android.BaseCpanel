package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCountRequest;
import ntk.base.api.article.model.ArticleExportFileRequest;
import ntk.base.api.article.model.ArticleGetAllRequest;
import ntk.base.api.article.model.ArticleTagAddRequest;
import ntk.base.api.article.model.ArticleTagDeleteRequest;
import ntk.base.api.article.model.ArticleTagEditRequest;
import ntk.base.api.article.model.ArticleTagResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleTag {

    @POST("api/articleTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleTag/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleTagResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleTagAddRequest request);

    @PUT("api/articleTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleTagEditRequest request);

    @DELETE("api/articleTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleTagDeleteRequest request);

    @POST("api/articleTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/articleTag/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleTagResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}
