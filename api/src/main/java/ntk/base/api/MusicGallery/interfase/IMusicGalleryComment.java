package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryCommentAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryCommentDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryCommentEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryCommentResponse;
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

public interface IMusicGalleryComment {

    @POST("api/MusicGalleryComment/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCommentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryComment/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCommentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryComment/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCommentResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryCommentAddRequest request);

    @PUT("api/MusicGalleryComment/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCommentResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryCommentEditRequest request);

    @DELETE("api/MusicGalleryComment/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCommentResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryCommentDeleteRequest request);

    @POST("api/MusicGalleryComment/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCommentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MusicGalleryExportFileRequest request);

    @POST("api/MusicGalleryComment/count/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryCommentResponse> Count(@HeaderMap Map<String, String> headers, @Body MusicGalleryCountRequest request);
}
