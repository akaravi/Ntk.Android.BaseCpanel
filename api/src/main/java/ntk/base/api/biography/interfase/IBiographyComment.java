package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyCommentAddRequest;
import ntk.base.api.biography.model.BiographyCommentDeleteRequest;
import ntk.base.api.biography.model.BiographyCommentEditRequest;
import ntk.base.api.biography.model.BiographyCommentResponse;
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

public interface IBiographyComment {

    @POST("api/BiographyComment/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCommentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyComment/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCommentResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyComment/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCommentResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyCommentAddRequest request);

    @PUT("api/BiographyComment/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCommentResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyCommentEditRequest request);

    @DELETE("api/BiographyComment/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCommentResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyCommentDeleteRequest request);

    @POST("api/BiographyComment/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCommentResponse> exportFile(@HeaderMap Map<String, String> headers, @Body BiographyExportFileRequest request);

    @POST("api/BiographyComment/count/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCommentResponse> Count(@HeaderMap Map<String, String> headers, @Body BiographyCountRequest request);
}
