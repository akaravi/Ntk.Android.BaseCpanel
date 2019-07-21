package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyCountRequest;
import ntk.base.api.biography.model.BiographyExportFileRequest;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import ntk.base.api.biography.model.BiographyShareServerCategoryAddRequest;
import ntk.base.api.biography.model.BiographyShareServerCategoryDeleteRequest;
import ntk.base.api.biography.model.BiographyShareServerCategoryEditRequest;
import ntk.base.api.biography.model.BiographyShareServerCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyShareServerCategory {

    @POST("api/BiographyShareServerCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareServerCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyShareServerCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareServerCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyShareServerCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareServerCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyShareServerCategoryAddRequest request);

    @PUT("api/BiographyShareServerCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareServerCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyShareServerCategoryEditRequest request);

    @DELETE("api/BiographyShareServerCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareServerCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyShareServerCategoryDeleteRequest request);

    @POST("api/BiographyShareServerCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareServerCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BiographyExportFileRequest request);

    @POST("api/BiographyShareServerCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareServerCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body BiographyCountRequest request);
}
