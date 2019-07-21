package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryCommentAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryCommentDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryCommentEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryCommentResponse;
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

public interface IMovieGalleryComment {

    @POST("api/MovieGalleryComment/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCommentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryComment/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCommentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryComment/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCommentResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryCommentAddRequest request);

    @PUT("api/MovieGalleryComment/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCommentResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryCommentEditRequest request);

    @DELETE("api/MovieGalleryComment/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCommentResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryCommentDeleteRequest request);

    @POST("api/MovieGalleryComment/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCommentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MovieGalleryExportFileRequest request);

    @POST("api/MovieGalleryComment/count/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryCommentResponse> Count(@HeaderMap Map<String, String> headers, @Body MovieGalleryCountRequest request);
}
