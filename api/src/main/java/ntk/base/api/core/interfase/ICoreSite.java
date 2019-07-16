package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreSiteAddRequest;
import ntk.base.api.core.model.CoreSiteDeleteRequest;
import ntk.base.api.core.model.CoreSiteEditRequest;
import ntk.base.api.core.model.CoreSiteGetAllWithAliasRequest;
import ntk.base.api.core.model.CoreSiteResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSite {

    @POST("api/CoreSite/getallwithalias/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> GetAllWithAlias(@HeaderMap Map<String, String> headers, @Body CoreSiteGetAllWithAliasRequest request);

    @POST("api/CoreModuleSite/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreModuleSite/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreModuleSite/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreSiteAddRequest request);

    @PUT("api/CoreModuleSite/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreSiteEditRequest request);

    @DELETE("api/CoreModuleSite/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreSiteDeleteRequest request);

    @POST("api/CoreModuleSite/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreModuleSite/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}

