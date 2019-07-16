package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreGetAllRequest;
import ntk.base.api.core.model.CorePageTemplateAddRequest;
import ntk.base.api.core.model.CorePageTemplateDeleteRequest;
import ntk.base.api.core.model.CorePageTemplateEditRequest;
import ntk.base.api.core.model.CorePageTemplateGetAllAvailableRequest;
import ntk.base.api.core.model.CorePageTemplateResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICorePageTemplate {

    @POST("api/CorePageTemplate/getallAvailable/")
    @Headers({"content-type: application/json"})
    Observable<CorePageTemplateResponse> GetAllAvailable(@HeaderMap Map<String, String> headers, @Body CorePageTemplateGetAllAvailableRequest request);

    @POST("api/CorePageTemplate/getall/")
    @Headers({"content-type: application/json"})
    Observable<CorePageTemplateResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CorePageTemplate/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CorePageTemplateResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CorePageTemplate/add/")
    @Headers({"content-type: application/json"})
    Observable<CorePageTemplateResponse> Add(@HeaderMap Map<String, String> headers, @Body CorePageTemplateAddRequest request);

    @PUT("api/CorePageTemplate/edit/")
    @Headers({"content-type: application/json"})
    Observable<CorePageTemplateResponse> Edit(@HeaderMap Map<String, String> headers, @Body CorePageTemplateEditRequest request);

    @DELETE("api/CorePageTemplate/delete/")
    @Headers({"content-type: application/json"})
    Observable<CorePageTemplateResponse> Delete(@HeaderMap Map<String, String> headers, @Body CorePageTemplateDeleteRequest request);
}