package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleContentAddRequest;
import ntk.base.api.article.model.ArticleContentDeleteRequest;
import ntk.base.api.article.model.ArticleContentEditRequest;
import ntk.base.api.article.model.ArticleContentResponse;
import ntk.base.api.article.model.ArticleCountRequest;
import ntk.base.api.article.model.ArticleExportFileRequest;
import ntk.base.api.article.model.ArticleGetAllRequest;
import ntk.base.api.article.model.ArticleGetAllWithSimilarsIdRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleContent {

    @POST("api/articleContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @POST("api/articleContent/GetAllWithSimilarsId/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> GetAllWithSimilarsId(@HeaderMap Map<String, String> headers, @Body ArticleGetAllWithSimilarsIdRequest request);

    @GET("api/articleContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleContent/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleContentAddRequest request);

    @PUT("api/articleContent/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleContentEditRequest request);

    @DELETE("api/articleContent/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleContentDeleteRequest request);

    @POST("api/articleContent/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/articleContent/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}

