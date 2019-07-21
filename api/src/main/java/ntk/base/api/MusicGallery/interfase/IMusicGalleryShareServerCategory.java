package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryCountRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryExportFileRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryGetAllRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareServerCategoryAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareServerCategoryDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareServerCategoryEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryShareServerCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IMusicGalleryShareServerCategory {

    @POST("api/MusicGalleryShareServerCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareServerCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryShareServerCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareServerCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryShareServerCategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareServerCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareServerCategoryAddRequest request);

    @PUT("api/MusicGalleryShareServerCategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareServerCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareServerCategoryEditRequest request);

    @DELETE("api/MusicGalleryShareServerCategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareServerCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryShareServerCategoryDeleteRequest request);

    @POST("api/MusicGalleryShareServerCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareServerCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MusicGalleryExportFileRequest request);

    @POST("api/MusicGalleryShareServerCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryShareServerCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body MusicGalleryCountRequest request);
}
