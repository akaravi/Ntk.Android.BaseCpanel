package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleContentAndParameterValueAddRequest;
import ntk.base.api.article.model.ArticleContentAndParameterValueDeleteRequest;
import ntk.base.api.article.model.ArticleContentAndParameterValueEditRequest;
import ntk.base.api.article.model.ArticleContentAndParameterValueResponse;
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

public interface IArticleContentAndParameterValue {

    @POST("api/ArticleContentAndParameterValue/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentAndParameterValueResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/ArticleContentAndParameterValue/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentAndParameterValueResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ArticleContentAndParameterValue/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentAndParameterValueResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleContentAndParameterValueAddRequest request);

    @PUT("api/ArticleContentAndParameterValue/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentAndParameterValueResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleContentAndParameterValueEditRequest request);

    @DELETE("api/ArticleContentAndParameterValue/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentAndParameterValueResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleContentAndParameterValueDeleteRequest request);

    @POST("api/ArticleContentAndParameterValue/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentAndParameterValueResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ArticleExportFileRequest request);

    @POST("api/ArticleContentAndParameterValue/count/")
    @Headers({"content-type: application/json"})
    Observable<ArticleContentAndParameterValueResponse> Count(@HeaderMap Map<String, String> headers, @Body ArticleCountRequest request);
}
