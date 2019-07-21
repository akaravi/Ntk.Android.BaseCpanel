package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryCountRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryExportFileRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryGetAllRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryTagAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryTagDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryTagEditRequest;
import ntk.base.api.ImageGallery.model.ImgGalleryTagResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IImgGalleryTag {

    @POST("api/ImageGalleryTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImgGalleryTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImgGalleryTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryTag/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImgGalleryTagResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryTagAddRequest request);

    @PUT("api/ImageGalleryTag/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImgGalleryTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryTagEditRequest request);

    @DELETE("api/ImageGalleryTag/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImgGalleryTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryTagDeleteRequest request);

    @POST("api/ImageGalleryTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ImgGalleryTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ImageGalleryExportFileRequest request);

    @POST("api/ImageGalleryTag/count/")
    @Headers({"content-type: application/json"})
    Observable<ImgGalleryTagResponse> Count(@HeaderMap Map<String, String> headers, @Body ImageGalleryCountRequest request);
}
