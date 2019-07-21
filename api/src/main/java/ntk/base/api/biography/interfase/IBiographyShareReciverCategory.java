package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyCountRequest;
import ntk.base.api.biography.model.BiographyExportFileRequest;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import ntk.base.api.biography.model.BiographyShareReciverCategoryAddRequest;
import ntk.base.api.biography.model.BiographyShareReciverCategoryDeleteRequest;
import ntk.base.api.biography.model.BiographyShareReciverCategoryEditRequest;
import ntk.base.api.biography.model.BiographyShareReciverCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyShareReciverCategory {

    @POST("api/BiographyShareReciverCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareReciverCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyShareReciverCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareReciverCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyShareReciverCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareReciverCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyShareReciverCategoryAddRequest request);

    @PUT("api/BiographyShareReciverCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareReciverCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyShareReciverCategoryEditRequest request);

    @DELETE("api/BiographyShareReciverCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareReciverCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyShareReciverCategoryDeleteRequest request);

    @POST("api/BiographyShareReciverCategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareReciverCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BiographyExportFileRequest request);

    @POST("api/BiographyShareReciverCategory/count/")
    @Headers({"content-type: application/json"})
    Observable<BiographyShareReciverCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body BiographyCountRequest request);
}
