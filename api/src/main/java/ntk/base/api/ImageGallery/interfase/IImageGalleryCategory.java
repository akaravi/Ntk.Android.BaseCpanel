package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryCategoryAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryCategoryDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryCategoryEditRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryCategoryResponse;
import ntk.base.api.ImageGallery.model.ImageGalleryGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IImageGalleryCategory {

    @POST("api/ImageGalleryCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryCategoryAddRequest request);

    @PUT("api/ImageGalleryCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryCategoryEditRequest request);

    @DELETE("api/ImageGalleryCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryCategoryDeleteRequest request);

}
