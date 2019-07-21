package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryContentTagAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryContentTagDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryContentTagEditRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryContentTagResponse;
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

public interface IImageGalleryContentTag {

    @POST("api/ImageGalleryContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryContentTag/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentTagAddRequest request);

    @PUT("api/ImageGalleryContentTag/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentTagEditRequest request);

    @DELETE("api/ImageGalleryContentTag/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentTagDeleteRequest request);

    @POST("api/ImageGalleryContentTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ImageGalleryExportFileRequest request);

    @POST("api/ImageGalleryContentTag/count/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentTagResponse> Count(@HeaderMap Map<String, String> headers, @Body ImageGalleryCountRequest request);
}
