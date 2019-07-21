package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryCountRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryExportFileRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryGetAllRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareServerCategoryAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareServerCategoryDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareServerCategoryEditRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryShareServerCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IImageGalleryShareServerCategory {

    @POST("api/ImageGalleryShareServerCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareServerCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryShareServerCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareServerCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryShareServerCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareServerCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareServerCategoryAddRequest request);

    @PUT("api/ImageGalleryShareServerCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareServerCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareServerCategoryEditRequest request);

    @DELETE("api/ImageGalleryShareServerCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareServerCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryShareServerCategoryDeleteRequest request);

    @POST("api/ImageGalleryShareServerCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareServerCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ImageGalleryExportFileRequest request);

    @POST("api/ImageGalleryShareServerCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryShareServerCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body ImageGalleryCountRequest request);
}
