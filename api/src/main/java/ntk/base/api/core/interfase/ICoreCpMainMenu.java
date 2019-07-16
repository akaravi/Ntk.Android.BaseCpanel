package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreCpMainMenuAddRequest;
import ntk.base.api.core.model.CoreCpMainMenuDeleteRequest;
import ntk.base.api.core.model.CoreCpMainMenuEditRequest;
import ntk.base.api.core.model.CoreCpMainMenuResponse;
import ntk.base.api.core.model.CoreGetAllMenuPlaceTypeRequest;
import ntk.base.api.core.model.CoreGetAllMenuRequest;
import ntk.base.api.core.model.CoreGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ICoreCpMainMenu {

    @POST("api/CoreCpMainMenu/getAllMenuPlaceType/")
    @Headers({"content-type: application/json"})
    Observable<CoreCpMainMenuResponse> GetAllMenuPlaceType(@HeaderMap Map<String, String> headers, @Body CoreGetAllMenuPlaceTypeRequest request);

    @POST("api/CoreCpMainMenu/getAllMenu/")
    @Headers({"content-type: application/json"})
    Observable<CoreCpMainMenuResponse> GetAllMenu(@HeaderMap Map<String, String> headers, @Body CoreGetAllMenuRequest request);

    @POST("api/CoreCpMainMenu/getall/")
    @Headers({"content-type: application/json"})
    Observable<CoreCpMainMenuResponse> GetAll(@HeaderMap Map<String, String> headers, @Body CoreGetAllRequest request);

    @GET("api/CoreCpMainMenu/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<CoreCpMainMenuResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/CoreCpMainMenu/add/")
    @Headers({"content-type: application/json"})
    Observable<CoreCpMainMenuResponse> Add(@HeaderMap Map<String, String> headers, @Body CoreCpMainMenuAddRequest request);

    @PUT("api/CoreCpMainMenu/edit/")
    @Headers({"content-type: application/json"})
    Observable<CoreCpMainMenuResponse> Edit(@HeaderMap Map<String, String> headers, @Body CoreCpMainMenuEditRequest request);

    @DELETE("api/CoreCpMainMenu/delete/")
    @Headers({"content-type: application/json"})
    Observable<CoreCpMainMenuResponse> Delete(@HeaderMap Map<String, String> headers, @Body CoreCpMainMenuDeleteRequest request);
}
