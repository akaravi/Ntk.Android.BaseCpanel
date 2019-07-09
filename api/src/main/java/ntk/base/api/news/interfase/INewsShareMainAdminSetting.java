package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCountRequest;
import ntk.base.api.news.model.NewsExportFileRequest;
import ntk.base.api.news.model.NewsGetAllRequest;
import ntk.base.api.news.model.NewsShareMainAdminSettingAddRequest;
import ntk.base.api.news.model.NewsShareMainAdminSettingDeleteRequest;
import ntk.base.api.news.model.NewsShareMainAdminSettingEditRequest;
import ntk.base.api.news.model.NewsShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsShareMainAdminSetting {

    @POST("api/NewsShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/NewsShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/NewsShareMainAdminSetting/Add/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsShareMainAdminSettingAddRequest request);

    @PUT("api/NewsShareMainAdminSetting/Edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsShareMainAdminSettingEditRequest request);

    @DELETE("api/NewsShareMainAdminSetting/Delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsShareMainAdminSettingDeleteRequest request);

    @POST("api/NewsShareMainAdminSetting/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareMainAdminSettingResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/NewsShareMainAdminSetting/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsShareMainAdminSettingResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
