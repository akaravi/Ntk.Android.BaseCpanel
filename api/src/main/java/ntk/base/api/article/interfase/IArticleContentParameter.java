package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleContentParameterAddRequest;
import ntk.base.api.article.model.ArticleContentParameterDeleteRequest;
import ntk.base.api.article.model.ArticleContentParameterEditRequest;
import ntk.base.api.article.model.ArticleContentParameterResponse;
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

public interface IArticleContentParameter {

    @POST("api/articleContentParameter/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleContentParameter/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleContentParameter/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleContentParameterAddRequest request);

    @PUT("api/articleContentParameter/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleContentParameterEditRequest request);

    @DELETE("api/articleContentParameter/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleContentParameterDeleteRequest request);

    @POST("api/articleContentParameter/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/articleContentParameter/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}
