package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyCountRequest;
import ntk.base.api.biography.model.BiographyExportFileRequest;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import ntk.base.api.biography.model.BiographyTagAddRequest;
import ntk.base.api.biography.model.BiographyTagDeleteRequest;
import ntk.base.api.biography.model.BiographyTagEditRequest;
import ntk.base.api.biography.model.BiographyTagResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyTag {

    @POST("api/BiographyTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyTag/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyTagResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyTagAddRequest request);

    @PUT("api/BiographyTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyTagEditRequest request);

    @DELETE("api/BiographyTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyTagDeleteRequest request);

    @POST("api/BiographyTag/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BiographyTagResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BiographyExportFileRequest request);

    @POST("api/BiographyTag/count/")
    @Headers({"content-type: application/json"})
    Observable<BiographyTagResponse> Count(@HeaderMap Map<String, String> headers, @Body BiographyCountRequest request);
}
