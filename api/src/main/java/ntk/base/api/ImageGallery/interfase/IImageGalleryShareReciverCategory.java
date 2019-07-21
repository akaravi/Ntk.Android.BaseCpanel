package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryCountRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryExportFileRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryGetAllRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareReciverCategoryAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareReciverCategoryDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareReciverCategoryEditRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IImageGalleryShareReciverCategory {

    @POST("api/ImageGalleryShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryShareReciverCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareReciverCategoryAddRequest request);

    @PUT("api/ImageGalleryShareReciverCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareReciverCategoryEditRequest request);

    @DELETE("api/ImageGalleryShareReciverCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareReciverCategoryDeleteRequest request);

    @POST("api/ImageGalleryShareReciverCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareReciverCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ImageGalleryExportFileRequest request);

    @POST("api/ImageGalleryShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body ImageGalleryCountRequest request);
}
