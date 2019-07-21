package ntk.base.api.MovieGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MovieGallery.model.MovieGalleryContentAddRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryContentDeleteFilterModelRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryContentDeleteRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryContentEditRequest;
import ntk.base.api.MovieGallery.model.MovieGalleryContentResponse;
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

public interface IMovieGalleryContent {

    @POST("api/MovieGalleryContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MovieGalleryGetAllRequest request);

    @GET("api/MovieGalleryContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MovieGalleryContent/Add/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> Add(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentAddRequest request);

    @PUT("api/MovieGalleryContent/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentEditRequest request);

    @DELETE("api/MovieGalleryContent/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentDeleteRequest request);

    @DELETE("api/MovieGalleryContent/DeleteFilterModel/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> DeleteFilterModel(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentDeleteFilterModelRequest request);

    @POST("api/MovieGalleryContent/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MovieGalleryExportFileRequest request);

    @POST("api/MovieGalleryContent/count/")
    @Headers({"content-type: application/json"})
    Observable<MovieGalleryContentResponse> Count(@HeaderMap Map<String, String> headers, @Body MovieGalleryCountRequest request);
}
