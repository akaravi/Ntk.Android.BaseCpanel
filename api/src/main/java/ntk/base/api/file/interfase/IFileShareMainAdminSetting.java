package ntk.base.api.file.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.file.model.FileGetAllRequest;
import ntk.base.api.file.model.FileShareMainAdminSettingAddRequest;
import ntk.base.api.file.model.FileShareMainAdminSettingDeleteRequest;
import ntk.base.api.file.model.FileShareMainAdminSettingEditRequest;
import ntk.base.api.file.model.FileShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IFileShareMainAdminSetting {

    @POST("api/FileShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<FileShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body FileGetAllRequest request);

    @GET("api/FileShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<FileShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/FileShareMainAdminSetting/add/")
    @Headers({"content-type: application/json"})
    Observable<FileShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body FileShareMainAdminSettingAddRequest request);

    @PUT("api/FileShareMainAdminSetting/edit/")
    @Headers({"content-type: application/json"})
    Observable<FileShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body FileShareMainAdminSettingEditRequest request);

    @DELETE("api/FileShareMainAdminSetting/delete/")
    @Headers({"content-type: application/json"})
    Observable<FileShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body FileShareMainAdminSettingDeleteRequest request);
}
