package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyContentAddRequest;
import ntk.base.api.biography.model.BiographyContentDeleteRequest;
import ntk.base.api.biography.model.BiographyContentEditRequest;
import ntk.base.api.biography.model.BiographyContentResponse;
import ntk.base.api.biography.model.BiographyCountRequest;
import ntk.base.api.biography.model.BiographyExportFileRequest;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import ntk.base.api.biography.model.BiographyGetAllWithSimilarsIdRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyContent {

    @POST("api/BiographyContent/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @POST("api/BiographyContent/GetAllWithSimilarsId/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> GetAllWithSimilarsId(@HeaderMap Map<String, String> headers, @Body BiographyGetAllWithSimilarsIdRequest request);

    @GET("api/BiographyContent/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyContent/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyContentAddRequest request);

    @PUT("api/BiographyContent/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyContentEditRequest request);

    @DELETE("api/BiographyContent/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyContentDeleteRequest request);

    @POST("api/BiographyContent/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body BiographyExportFileRequest request);

    @POST("api/BiographyContent/count/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentResponse> Count(@HeaderMap Map<String, String> headers, @Body BiographyCountRequest request);
}

