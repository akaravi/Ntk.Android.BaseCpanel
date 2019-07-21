package ntk.base.api.ImageGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ImageGallery.model.ImageGalleryContentAddRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryContentDeleteFilterModelRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryContentDeleteRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryContentEditRequest;
import ntk.base.api.ImageGallery.model.ImageGalleryContentResponse;
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

public interface IImageGalleryContent {

    @POST("api/ImageGalleryContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ImageGalleryGetAllRequest request);

    @GET("api/ImageGalleryContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ImageGalleryContent/Add/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> Add(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentAddRequest request);

    @PUT("api/ImageGalleryContent/Edit/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentEditRequest request);

    @DELETE("api/ImageGalleryContent/Delete/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentDeleteRequest request);

    @DELETE("api/ImageGalleryContent/DeleteFilterModel/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> DeleteFilterModel(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentDeleteFilterModelRequest request);

    @POST("api/ImageGalleryContent/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body ImageGalleryExportFileRequest request);

    @POST("api/ImageGalleryContent/count/")
    @Headers({"content-type: application/json"})
    Observable<ImageGalleryContentResponse> Count(@HeaderMap Map<String, String> headers, @Body ImageGalleryCountRequest request);
}
