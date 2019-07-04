package ntk.base.api.auth.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.auth.model.AuthSiteAccessResponse;
import ntk.base.api.auth.model.AuthSiteStorageResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;

public interface IAuthGET {

    @GET("FileConfiguration/SiteAccess/34/")
    @Headers({"content-type: application/json"})
    Observable<AuthSiteAccessResponse> SiteAccess(@HeaderMap Map<String, String> headers);

    @GET("FileConfiguration/SiteStorage/34/")
    @Headers({"content-type: application/json"})
    Observable<AuthSiteStorageResponse> SiteStorage(@HeaderMap Map<String, String> headers);

}
