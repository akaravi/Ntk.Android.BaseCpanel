package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleContentParameterTypeAddRequest;
import ntk.base.api.article.model.ArticleContentParameterTypeDeleteRequest;
import ntk.base.api.article.model.ArticleContentParameterTypeEditRequest;
import ntk.base.api.article.model.ArticleContentParameterTypeResponse;
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

public interface IArticleContentParameterType {

    @POST("api/articleContentParameterType/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterTypeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleContentParameterType/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterTypeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleContentParameterType/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterTypeResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleContentParameterTypeAddRequest request);

    @PUT("api/articleContentParameterType/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterTypeResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleContentParameterTypeEditRequest request);

    @DELETE("api/articleContentParameterType/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterTypeResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleContentParameterTypeDeleteRequest request);

    @POST("api/articleContentParameterType/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterTypeResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/articleContentParameterType/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentParameterTypeResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}
