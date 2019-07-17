package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreSiteCategoryCmsModuleAddRequest;
import ntk.base.api.core.model.CoreSiteCategoryCmsModuleDeleteRequest;
import ntk.base.api.core.model.CoreSiteCategoryCmsModuleEditRequest;
import ntk.base.api.core.model.CoreSiteCategoryCmsModuleResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSiteCategoryCmsModule {

    @POST("api/CoreSiteCategoryCmsModule/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryCmsModuleResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreSiteCategoryCmsModule/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryCmsModuleResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreSiteCategoryCmsModule/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryCmsModuleResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreSiteCategoryCmsModuleAddRequest request);

    @PUT("api/CoreSiteCategoryCmsModule/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryCmsModuleResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreSiteCategoryCmsModuleEditRequest request);

    @DELETE("api/CoreSiteCategoryCmsModule/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryCmsModuleResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreSiteCategoryCmsModuleDeleteRequest request);

    @POST("api/CoreSiteCategoryCmsModule/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryCmsModuleResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreSiteCategoryCmsModule/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteCategoryCmsModuleResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}