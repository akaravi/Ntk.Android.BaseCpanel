package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryCountRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryExportFileRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryGetAllRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryTagAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryTagDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryTagEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryTagResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMusicGalleryTag {

    @POST("api/MusicGalleryTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryTag/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryTagResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryTagAddRequest request);

    @PUT("api/MusicGalleryTag/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryTagEditRequest request);

    @DELETE("api/MusicGalleryTag/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryTagDeleteRequest request);

    @POST("api/MusicGalleryTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MusicGalleryExportFileRequest request);

    @POST("api/MusicGalleryTag/count/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryTagResponse> Count(@HeaderMap Map<String, String> headers, @Body MusicGalleryCountRequest request);
}
