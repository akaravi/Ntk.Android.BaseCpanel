package ntk.base.api.file.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.file.model.FileCategoryAddRequest;
import ntk.base.api.file.model.FileCategoryDeleteRequest;
import ntk.base.api.file.model.FileCategoryEditRequest;
import ntk.base.api.file.model.FileCategoryResponse;
import ntk.base.api.file.model.FileGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IFileCategory {

    @POST("api/FileCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<FileCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body FileGetAllRequest request);

    @GET("api/FileCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<FileCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/FileCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<FileCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body FileCategoryAddRequest request);

    @PUT("api/FileCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<FileCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body FileCategoryEditRequest request);

    @DELETE("api/FileCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<FileCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body FileCategoryDeleteRequest request);
}
