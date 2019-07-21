package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryCountRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryExportFileRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryGetAllRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryTagAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryTagDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryTagEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryTagResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMovieGalleryTag {

    @POST("api/MovieGalleryTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryTag/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryTagResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryTagAddRequest request);

    @PUT("api/MovieGalleryTag/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryTagEditRequest request);

    @DELETE("api/MovieGalleryTag/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryTagDeleteRequest request);

    @POST("api/MovieGalleryTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MovieGalleryExportFileRequest request);

    @POST("api/MovieGalleryTag/count/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryTagResponse> Count(@HeaderMap Map<String, String> headers, @Body MovieGalleryCountRequest request);
}
