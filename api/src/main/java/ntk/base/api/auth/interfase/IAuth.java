package ntk.base.api.auth.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.auth.model.AuthAllMenuResponse;
import ntk.base.api.auth.model.AuthAllWithAliasResponse;
import ntk.base.api.auth.model.AuthClearTokenResponse;
import ntk.base.api.auth.model.AuthCountRequest;
import ntk.base.api.auth.model.AuthArticleCountResponse;
import ntk.base.api.auth.model.AuthSearchNewRequest;
import ntk.base.api.auth.model.AuthSearchNewResponse;
import ntk.base.api.auth.model.AuthUserLoginRequest;
import ntk.base.api.auth.model.AuthUserLoginResponse;
import ntk.base.api.auth.model.AuthAllRequest;
import ntk.base.api.auth.model.AuthSelectCurrentSiteRequest;
import ntk.base.api.auth.model.AuthSelectCurrentSiteResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IAuth {

    @POST("CoreUser/userlogin/")
    @Headers({"content-type: application/json"})
    Observable<AuthUserLoginResponse> UserLogin(@HeaderMap Map<String, String> headers, @Body AuthUserLoginRequest request);

    @POST("CoreSite/getAllwithalias/")
    @Headers({"content-type: application/json"})
    Observable<AuthAllWithAliasResponse> GetAllWithAlias(@HeaderMap Map<String, String> headers, @Body AuthAllRequest request);

    @POST("CoreCpMainMenu/GetAllMenu/")
    @Headers({"content-type: application/json"})
    Observable<AuthAllMenuResponse> GetAllMainMenu(@HeaderMap Map<String, String> headers, @Body AuthAllRequest request);

    @POST("CoreUser/SelectCurrentSite//")
    @Headers({"content-type: application/json"})
    Observable<AuthSelectCurrentSiteResponse> SelectCurrentSite(@HeaderMap Map<String, String> headers, @Body AuthSelectCurrentSiteRequest request);

    @POST("CoreSite/search_new/")
    @Headers({"content-type: application/json"})
    Observable<AuthSearchNewResponse> SearchNew(@HeaderMap Map<String, String> headers, @Body AuthSearchNewRequest request);

    @POST("articlecontent/count")
    @Headers({"content-type: application/json"})
    Observable<AuthArticleCountResponse> GetArticleCount(@HeaderMap Map<String, String> headers , @Body AuthCountRequest request);

    @POST("CoreUser/UserClearToken")
    @Headers({"content-type: application/json"})
    Observable<AuthClearTokenResponse> ClearToken(@HeaderMap Map<String, String> headers);

}
