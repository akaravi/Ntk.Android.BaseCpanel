package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleGetAllRequest;
import ntk.base.api.article.model.ArticleShareMainAdminSettingAddRequest;
import ntk.base.api.article.model.ArticleShareMainAdminSettingDeleteRequest;
import ntk.base.api.article.model.ArticleShareMainAdminSettingEditRequest;
import ntk.base.api.article.model.ArticleShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IArticleShareMainAdminSetting {

    @POST("api/articleShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ArticleGetAllRequest request);

    @GET("api/articleShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/articleShareMainAdminSetting/add/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body ArticleShareMainAdminSettingAddRequest request);

    @PUT("api/articleShareMainAdminSetting/edit/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body ArticleShareMainAdminSettingEditRequest request);

    @DELETE("api/articleShareMainAdminSetting/delete/")
    @Headers({"content-type: application/json"})
    Observable<ArticleShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body ArticleShareMainAdminSettingDeleteRequest request);
}