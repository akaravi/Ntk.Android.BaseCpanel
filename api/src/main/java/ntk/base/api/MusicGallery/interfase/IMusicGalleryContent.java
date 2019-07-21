package ntk.base.api.MusicGallery.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.MusicGallery.model.MusicGalleryContentAddRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryContentDeleteFilterModelRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryContentDeleteRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryContentEditRequest;
import ntk.base.api.MusicGallery.model.MusicGalleryContentResponse;
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

public interface IMusicGalleryContent {

    @POST("api/MusicGalleryContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body MusicGalleryGetAllRequest request);

    @GET("api/MusicGalleryContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/MusicGalleryContent/Add/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> Add(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentAddRequest request);

    @PUT("api/MusicGalleryContent/Edit/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentEditRequest request);

    @DELETE("api/MusicGalleryContent/Delete/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentDeleteRequest request);

    @DELETE("api/MusicGalleryContent/DeleteFilterModel/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> DeleteFilterModel(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentDeleteFilterModelRequest request);

    @POST("api/MusicGalleryContent/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body MusicGalleryExportFileRequest request);

    @POST("api/MusicGalleryContent/count/")
    @Headers({"content-type: application/json"})
    Observable<MusicGalleryContentResponse> Count(@HeaderMap Map<String, String> headers, @Body MusicGalleryCountRequest request);
}
