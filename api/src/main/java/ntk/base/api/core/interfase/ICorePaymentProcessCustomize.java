package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModulePaymentProcessCustomizeAutoAddRequest;
import ntk.base.api.core.model.CoreModulePaymentProcessCustomizeResponse;
import ntk.base.api.core.model.CorePaymentProcessCustomizeAddRequest;
import ntk.base.api.core.model.CorePaymentProcessCustomizeEditRequest;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICorePaymentProcessCustomize {

    @POST("api/CorePaymentProcessCustomize/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessCustomizeResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @POST("api/CmsModulePaymentProcessCustomize/AutoAdd/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessCustomizeResponse> AutoAdd(@HeaderMap Map<String, String> headers, @Body CoreModulePaymentProcessCustomizeAutoAddRequest request);

    @GET("api/CmsModulePaymentProcessCustomize/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessCustomizeResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CmsModulePaymentProcessCustomize/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessCustomizeResponse> Add(@HeaderMap Map<String, String> headers, @Body CorePaymentProcessCustomizeAddRequest request);

    @PUT("api/CmsModulePaymentProcessCustomize/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessCustomizeResponse> Edit(@HeaderMap Map<String, String> headers, @Body CorePaymentProcessCustomizeEditRequest request);
}