package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CoreModulePaymentProcessGetOneWithJsonFormatterRequest;
import ntk.base.api.core.model.CoreModulePaymentProcessResponse;
import ntk.base.api.core.model.CorePaymentProcessAddRequest;
import ntk.base.api.core.model.CorePaymentProcessAutoAddRequest;
import ntk.base.api.core.model.CorePaymentProcessDeleteRequest;
import ntk.base.api.core.model.CorePaymentProcessEditRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICorePaymentProcess {

    @POST("api/CorePaymentProcess/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @POST("api/CmsModulePaymentProcess/AutoAdd/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessResponse> AutoAdd(@HeaderMap Map<String, String> headers, @Body CorePaymentProcessAutoAddRequest request);

    @GET("api/CmsModulePaymentProcess/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CmsModulePaymentProcess/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessResponse> Add(@HeaderMap Map<String, String> headers, @Body CorePaymentProcessAddRequest request);

    @PUT("api/CmsModulePaymentProcess/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessResponse> Edit(@HeaderMap Map<String, String> headers, @Body CorePaymentProcessEditRequest request);

    @DELETE("api/CmsModulePaymentProcess/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessResponse> Delete(@HeaderMap Map<String, String> headers, @Body CorePaymentProcessDeleteRequest request);

    @DELETE("api/CmsModulePaymentProcess/GetOneWithJsonFormatter/")
    @Headers({"content-type: application/json"})
    Observable<CoreModulePaymentProcessResponse> GetOneWithJsonFormatter(@HeaderMap Map<String, String> headers, @Body CoreModulePaymentProcessGetOneWithJsonFormatterRequest request);


}