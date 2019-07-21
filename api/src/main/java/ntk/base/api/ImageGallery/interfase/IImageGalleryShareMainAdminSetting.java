package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryGetAllRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareMainAdminSettingAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareMainAdminSettingDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareMainAdminSettingEditRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IImageGalleryShareMainAdminSetting {

    @POST("api/ImageGalleryShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryShareMainAdminSetting/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareMainAdminSettingAddRequest request);

    @PUT("api/ImageGalleryShareMainAdminSetting/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareMainAdminSettingEditRequest request);

    @DELETE("api/ImageGalleryShareMainAdminSetting/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareMainAdminSettingDeleteRequest request);
}
