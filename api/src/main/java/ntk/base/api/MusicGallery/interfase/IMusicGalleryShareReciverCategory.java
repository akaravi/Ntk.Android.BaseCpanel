package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryCountRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryExportFileRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryGetAllRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareReciverCategoryAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareReciverCategoryDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareReciverCategoryEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMusicGalleryShareReciverCategory {

    @POST("api/MusicGalleryShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryShareReciverCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareReciverCategoryAddRequest request);

    @PUT("api/MusicGalleryShareReciverCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareReciverCategoryEditRequest request);

    @DELETE("api/MusicGalleryShareReciverCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareReciverCategoryDeleteRequest request);

    @POST("api/MusicGalleryShareReciverCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareReciverCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MusicGalleryExportFileRequest request);

    @POST("api/MusicGalleryShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body MusicGalleryCountRequest request);
}
