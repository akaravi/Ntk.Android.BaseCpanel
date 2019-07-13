package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationCountRequest;
import ntk.base.api.application.model.ApplicationExportFileRequest;
import ntk.base.api.application.model.ApplicationGetAllRequest;
import ntk.base.api.application.model.ApplicationIntroAddRequest;
import ntk.base.api.application.model.ApplicationIntroDeleteRequest;
import ntk.base.api.application.model.ApplicationIntroEditRequest;
import ntk.base.api.application.model.ApplicationIntroResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IApplicationIntro {

    @POST("api/ApplicationIntro/getall/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationIntroResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ApplicationGetAllRequest request);

    @GET("api/ApplicationIntro/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationIntroResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/ApplicationIntro/add/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationIntroResponse> Add(@HeaderMap Map<String, String> headers, @Body ApplicationIntroAddRequest request);

    @PUT("api/ApplicationIntro/edit/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationIntroResponse> Edit(@HeaderMap Map<String, String> headers, @Body ApplicationIntroEditRequest request);

    @DELETE("api/ApplicationIntro/delete/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationIntroResponse> Delete(@HeaderMap Map<String, String> headers, @Body ApplicationIntroDeleteRequest request);

    @POST("api/ApplicationIntro/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationIntroResponse> exportFile(@HeaderMap Map<String, String> headers, @Body ApplicationExportFileRequest request);

    @POST("api/ApplicationIntro/count/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationIntroResponse> Count(@HeaderMap Map<String, String> headers, @Body ApplicationCountRequest request);
}
