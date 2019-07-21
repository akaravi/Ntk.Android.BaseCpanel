package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyContentParameterTypeAddRequest;
import ntk.base.api.biography.model.BiographyContentParameterTypeDeleteRequest;
import ntk.base.api.biography.model.BiographyContentParameterTypeEditRequest;
import ntk.base.api.biography.model.BiographyContentParameterTypeResponse;
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

public interface IBiographyContentParameterType {

    @POST("api/BiographyContentParameterType/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterTypeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyContentParameterType/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterTypeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyContentParameterType/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterTypeResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyContentParameterTypeAddRequest request);

    @PUT("api/BiographyContentParameterType/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterTypeResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyContentParameterTypeEditRequest request);

    @DELETE("api/BiographyContentParameterType/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterTypeResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyContentParameterTypeDeleteRequest request);

    @POST("api/BiographyContentParameterType/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterTypeResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body BiographyExportFileRequest request);

    @POST("api/BiographyContentParameterType/count/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentParameterTypeResponse> Count(@HeaderMap Map<String, String> headers, @Body BiographyCountRequest request);
}
