package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryCountRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryExportFileRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryGetAllRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareServerCategoryAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareServerCategoryDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareServerCategoryEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryShareServerCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMovieGalleryShareServerCategory {

    @POST("api/MovieGalleryShareServerCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareServerCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryShareServerCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareServerCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryShareServerCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareServerCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareServerCategoryAddRequest request);

    @PUT("api/MovieGalleryShareServerCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareServerCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareServerCategoryEditRequest request);

    @DELETE("api/MovieGalleryShareServerCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareServerCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryShareServerCategoryDeleteRequest request);

    @POST("api/MovieGalleryShareServerCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareServerCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MovieGalleryExportFileRequest request);

    @POST("api/MovieGalleryShareServerCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryShareServerCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body MovieGalleryCountRequest request);
}
