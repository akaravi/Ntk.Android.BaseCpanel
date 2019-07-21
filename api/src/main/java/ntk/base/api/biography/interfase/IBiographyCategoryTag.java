package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyCategoryTagAddRequest;
import ntk.base.api.biography.model.BiographyCategoryTagDeleteRequest;
import ntk.base.api.biography.model.BiographyCategoryTagEditRequest;
import ntk.base.api.biography.model.BiographyCategoryTagResponse;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyCategoryTag {


    @POST("api/BiographyCategoryTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyCategoryTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyCategoryTag/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryTagResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyCategoryTagAddRequest request);

    @PUT("api/BiographyCategoryTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyCategoryTagEditRequest request);

    @DELETE("api/BiographyCategoryTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyCategoryTagDeleteRequest request);
}

