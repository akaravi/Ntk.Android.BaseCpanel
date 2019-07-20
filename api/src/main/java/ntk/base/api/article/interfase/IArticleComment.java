package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCommentAddRequest;
import ntk.base.api.article.model.ArticleCommentDeleteRequest;
import ntk.base.api.article.model.ArticleCommentEditRequest;
import ntk.base.api.article.model.ArticleCommentResponse;
import ntk.base.api.article.model.ArticleCountRequest;
import ntk.base.api.article.model.ArticleExportFileRequest;
import ntk.base.api.article.model.ArticleGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleComment {

    @POST("api/articleComment/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCommentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleComment/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCommentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleComment/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCommentResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleCommentAddRequest request);

    @PUT("api/articleComment/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCommentResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleCommentEditRequest request);

    @DELETE("api/articleComment/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCommentResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleCommentDeleteRequest request);

    @POST("api/articleComment/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCommentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/articleComment/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleCommentResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}
