package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryCategoryAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryCategoryDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryCategoryEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryCategoryResponse;
import ntk.base.api.MovieGallery.model.MovieGalleryGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMovieGalleryCategory {

    @POST("api/MovieGalleryCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryCategoryAddRequest request);

    @PUT("api/MovieGalleryCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryCategoryEditRequest request);

    @DELETE("api/MovieGalleryCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryCategoryDeleteRequest request);

}
