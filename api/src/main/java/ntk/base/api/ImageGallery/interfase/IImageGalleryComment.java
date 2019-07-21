package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryCommentAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryCommentDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryCommentEditRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryCommentResponse;
import ntk.base.api.ImageGallery.model.ImageGalleryCountRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryExportFileRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IImageGalleryComment {

    @POST("api/ImageGalleryComment/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCommentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryComment/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCommentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryComment/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCommentResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryCommentAddRequest request);

    @PUT("api/ImageGalleryComment/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCommentResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryCommentEditRequest request);

    @DELETE("api/ImageGalleryComment/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCommentResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryCommentDeleteRequest request);

    @POST("api/ImageGalleryComment/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCommentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ImageGalleryExportFileRequest request);

    @POST("api/ImageGalleryComment/count/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryCommentResponse> Count(@HeaderMap Map<String, String> headers, @Body ImageGalleryCountRequest request);
}
