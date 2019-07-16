package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreDeleteListRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreLogErrorDeleteRequest;
import ntk.base.api.core.model.CoreLogErrorResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ICoreLogError {

    @POST("api/CoreLogError/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreLogErrorResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @POST("api/CoreLogError/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<CoreLogErrorResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body CoreDeleteListRequest request);

    @GET("api/CoreLogError/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreLogErrorResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @DELETE("api/CoreLogError/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreLogErrorResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreLogErrorDeleteRequest request);

    @POST("api/CoreLogError/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreLogErrorResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreLogError/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreLogErrorResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
