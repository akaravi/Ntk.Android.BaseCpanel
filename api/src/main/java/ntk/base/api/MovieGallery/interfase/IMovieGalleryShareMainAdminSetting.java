package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryGetAllRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareMainAdminSettingAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareMainAdminSettingDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareMainAdminSettingEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareMainAdminSettingResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMovieGalleryShareMainAdminSetting {

    @POST("api/MovieGalleryShareMainAdminSetting/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareMainAdminSettingResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryShareMainAdminSetting/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareMainAdminSettingResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryShareMainAdminSetting/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareMainAdminSettingResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareMainAdminSettingAddRequest request);

    @PUT("api/MovieGalleryShareMainAdminSetting/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareMainAdminSettingResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareMainAdminSettingEditRequest request);

    @DELETE("api/MovieGalleryShareMainAdminSetting/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareMainAdminSettingResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareMainAdminSettingDeleteRequest request);
}
