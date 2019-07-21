package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryContentTagAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryContentTagDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryContentTagEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryContentTagResponse;
import ntk.base.api.MovieGallery.model.MovieGalleryCountRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryExportFileRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMovieGalleryContentTag {

    @POST("api/MovieGalleryContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryContentTag/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentTagAddRequest request);

    @PUT("api/MovieGalleryContentTag/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentTagEditRequest request);

    @DELETE("api/MovieGalleryContentTag/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentTagDeleteRequest request);

    @POST("api/MovieGalleryContentTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MovieGalleryExportFileRequest request);

    @POST("api/MovieGalleryContentTag/count/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentTagResponse> Count(@HeaderMap Map<String, String> headers, @Body MovieGalleryCountRequest request);
}
