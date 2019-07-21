package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryGetAllRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareMainAdminSettingAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareMainAdminSettingDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareMainAdminSettingEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMusicGalleryShareMainAdminSetting {

    @POST("api/MusicGalleryShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryShareMainAdminSetting/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareMainAdminSettingAddRequest request);

    @PUT("api/MusicGalleryShareMainAdminSetting/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareMainAdminSettingEditRequest request);

    @DELETE("api/MusicGalleryShareMainAdminSetting/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareMainAdminSettingDeleteRequest request);
}
