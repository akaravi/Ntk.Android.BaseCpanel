package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryCategoryAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryCategoryDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryCategoryEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryCategoryResponse;
import ntk.base.api.MusicGallery.model.MusicGalleryGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMusicGalleryCategory {

    @POST("api/MusicGalleryCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryCategoryAddRequest request);

    @PUT("api/MusicGalleryCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryCategoryEditRequest request);

    @DELETE("api/MusicGalleryCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryCategoryDeleteRequest request);

}
