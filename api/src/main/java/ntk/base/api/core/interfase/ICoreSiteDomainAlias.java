package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCountRequest;
import ntk.base.api.core.model.CoreExportFileRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreSiteDomainAliasAddRequest;
import ntk.base.api.core.model.CoreSiteDomainAliasDeleteRequest;
import ntk.base.api.core.model.CoreSiteDomainAliasEditRequest;
import ntk.base.api.core.model.CoreSiteDomainAliasResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreSiteDomainAlias {

    @POST("api/CoreSiteDomainAlias/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteDomainAliasResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreSiteDomainAlias/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteDomainAliasResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreSiteDomainAlias/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteDomainAliasResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreSiteDomainAliasAddRequest request);

    @PUT("api/CoreSiteDomainAlias/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteDomainAliasResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreSiteDomainAliasEditRequest request);

    @DELETE("api/CoreSiteDomainAlias/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteDomainAliasResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreSiteDomainAliasDeleteRequest request);

    @POST("api/CoreSiteDomainAlias/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteDomainAliasResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body CoreExportFileRequest request);

    @POST("api/CoreSiteDomainAlias/count/")
    @Headers({"content-type: application/json"})
    Observable<CoreSiteDomainAliasResponse> Count(@HeaderMap Map<String, String> headers, @Body CoreCountRequest request);
}
