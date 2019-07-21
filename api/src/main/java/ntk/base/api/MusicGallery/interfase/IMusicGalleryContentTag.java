package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryContentTagAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryContentTagDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryContentTagEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryContentTagResponse;
import ntk.base.api.MusicGallery.model.MusicGalleryCountRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryExportFileRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMusicGalleryContentTag {

    @POST("api/MusicGalleryContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryContentTag/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentTagAddRequest request);

    @PUT("api/MusicGalleryContentTag/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentTagEditRequest request);

    @DELETE("api/MusicGalleryContentTag/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentTagDeleteRequest request);

    @POST("api/MusicGalleryContentTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MusicGalleryExportFileRequest request);

    @POST("api/MusicGalleryContentTag/count/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentTagResponse> Count(@HeaderMap Map<String, String> headers, @Body MusicGalleryCountRequest request);
}
