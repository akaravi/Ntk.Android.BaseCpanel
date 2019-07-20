package ntk.base.api.file.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.file.model.FileContentAddRequest;
import ntk.base.api.file.model.FileContentCopyRequest;
import ntk.base.api.file.model.FileContentDeleteRequest;
import ntk.base.api.file.model.FileContentEditRequest;
import ntk.base.api.file.model.FileContentGetFilesFromCategoryRequest;
import ntk.base.api.file.model.FileContentImageFileEditRequest;
import ntk.base.api.file.model.FileContentResponse;
import ntk.base.api.file.model.FileContentUploadByUrlRequest;
import ntk.base.api.file.model.FileCountRequest;
import ntk.base.api.file.model.FileExportFileRequest;
import ntk.base.api.file.model.FileGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IFileContent {

    @POST("api/FileContent/UploadByUrl/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> UploadByUrl(@HeaderMap Map<String, String> headers, @Body FileContentUploadByUrlRequest request);

    @POST("api/FileContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body FileGetAllRequest request);

    @POST("api/FileContent/GetFilesFromCategory/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> GetFilesFromCategory(@HeaderMap Map<String, String> headers, @Body FileContentGetFilesFromCategoryRequest request);

    @GET("api/FileContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/FileContent/add/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> Add(@HeaderMap Map<String, String> headers, @Body FileContentAddRequest request);

    @POST("api/FileContent/Copy/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> Copy(@HeaderMap Map<String, String> headers, @Body FileContentCopyRequest request);

    @POST("api/FileContent/imageFileEdit/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> ImageFileEdit(@HeaderMap Map<String, String> headers, @Body FileContentImageFileEditRequest request);

    @PUT("api/FileContent/edit/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body FileContentEditRequest request);

    @DELETE("api/FileContent/delete/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body FileContentDeleteRequest request);

    @POST("api/FileContent/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body FileExportFileRequest request);

    @POST("api/FileContent/count/")
    @Headers({"content-type: application/json"})
    Observable<FileContentResponse> Count(@HeaderMap Map<String, String> headers, @Body FileCountRequest request);
}

