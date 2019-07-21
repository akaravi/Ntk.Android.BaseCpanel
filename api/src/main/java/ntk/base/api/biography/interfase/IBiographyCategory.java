package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyCategoryAddRequest;
import ntk.base.api.biography.model.BiographyCategoryBiographyCategoryRequest;
import ntk.base.api.biography.model.BiographyCategoryDeleteRequest;
import ntk.base.api.biography.model.BiographyCategoryEditRequest;
import ntk.base.api.biography.model.BiographyCategoryResponse;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyCategory {

    @POST("api/BiographyCategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyCategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyCategory/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyCategoryAddRequest request);

    @PUT("api/BiographyCategory/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryResponse> BiographyCategory(@HeaderMap Map<String, String> headers, @Body BiographyCategoryBiographyCategoryRequest request);

    @PUT("api/BiographyCategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyCategoryEditRequest request);

    @DELETE("api/BiographyCategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyCategoryDeleteRequest request);
}

