package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import ntk.base.api.biography.model.BiographyShareMainAdminSettingAddRequest;
import ntk.base.api.biography.model.BiographyShareMainAdminSettingDeleteRequest;
import ntk.base.api.biography.model.BiographyShareMainAdminSettingEditRequest;
import ntk.base.api.biography.model.BiographyShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyShareMainAdminSetting {

    @POST("api/BiographyShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyShareMainAdminSetting/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyShareMainAdminSettingAddRequest request);

    @PUT("api/BiographyShareMainAdminSetting/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyShareMainAdminSettingEditRequest request);

    @DELETE("api/BiographyShareMainAdminSetting/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyShareMainAdminSettingDeleteRequest request);
}