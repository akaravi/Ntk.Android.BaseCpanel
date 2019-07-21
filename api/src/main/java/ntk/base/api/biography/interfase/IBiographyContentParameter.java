package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyContentParameterAddRequest;
import ntk.base.api.biography.model.BiographyContentParameterDeleteRequest;
import ntk.base.api.biography.model.BiographyContentParameterEditRequest;
import ntk.base.api.biography.model.BiographyContentParameterResponse;
import ntk.base.api.biography.model.BiographyCountRequest;
import ntk.base.api.biography.model.BiographyExportFileRequest;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyContentParameter {

    @POST("api/BiographyContentParameter/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyContentParameter/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyContentParameter/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyContentParameterAddRequest request);

    @PUT("api/BiographyContentParameter/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyContentParameterEditRequest request);

    @DELETE("api/BiographyContentParameter/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyContentParameterDeleteRequest request);

    @POST("api/BiographyContentParameter/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BiographyExportFileRequest request);

    @POST("api/BiographyContentParameter/count/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterResponse> Count(@HeaderMap Map<String, String> headers, @Body BiographyCountRequest request);
}
