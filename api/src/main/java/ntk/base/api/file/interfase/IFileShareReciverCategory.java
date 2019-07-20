package ntk.base.api.file.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.file.model.FileCountRequest;
import ntk.base.api.file.model.FileExportFileRequest;
import ntk.base.api.file.model.FileGetAllRequest;
import ntk.base.api.file.model.FileShareReciverCategoryAddRequest;
import ntk.base.api.file.model.FileShareReciverCategoryDeleteRequest;
import ntk.base.api.file.model.FileShareReciverCategoryEditRequest;
import ntk.base.api.file.model.FileShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IFileShareReciverCategory {

    @POST("api/FileShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<FileShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body FileGetAllRequest request);

    @GET("api/FileShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<FileShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/FileShareReciverCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<FileShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body FileShareReciverCategoryAddRequest request);

    @PUT("api/FileShareReciverCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<FileShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body FileShareReciverCategoryEditRequest request);

    @DELETE("api/FileShareReciverCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<FileShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body FileShareReciverCategoryDeleteRequest request);

    @POST("api/FileShareReciverCategory/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<FileShareReciverCategoryResponse> exportFile(@HeaderMap Map<String, String> headers, @Body FileExportFileRequest request);

    @POST("api/FileShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<FileShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body FileCountRequest request);
}
