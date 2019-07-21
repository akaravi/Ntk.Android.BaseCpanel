package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryCountRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryExportFileRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryGetAllRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareReciverCategoryAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareReciverCategoryDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareReciverCategoryEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMovieGalleryShareReciverCategory {

    @POST("api/MovieGalleryShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryShareReciverCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareReciverCategoryAddRequest request);

    @PUT("api/MovieGalleryShareReciverCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareReciverCategoryEditRequest request);

    @DELETE("api/MovieGalleryShareReciverCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareReciverCategoryDeleteRequest request);

    @POST("api/MovieGalleryShareReciverCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareReciverCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MovieGalleryExportFileRequest request);

    @POST("api/MovieGalleryShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body MovieGalleryCountRequest request);
}
