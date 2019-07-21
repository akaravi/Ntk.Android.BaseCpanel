package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyContentTagAddBatchRequest;
import ntk.base.api.biography.model.BiographyContentTagAddRequest;
import ntk.base.api.biography.model.BiographyContentTagDeleteListRequest;
import ntk.base.api.biography.model.BiographyContentTagDeleteRequest;
import ntk.base.api.biography.model.BiographyContentTagEditRequest;
import ntk.base.api.biography.model.BiographyContentTagResponse;
import ntk.base.api.biography.model.BiographyGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBiographyContentTag {

    @POST("api/BiographyContentTag/getall/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentTagResponse> GetAll(@HeaderMap Map<String, String> headers, @Body BiographyGetAllRequest request);

    @GET("api/BiographyContentTag/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentTagResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/BiographyContentTag/add/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentTagResponse> Add(@HeaderMap Map<String, String> headers, @Body BiographyContentTagAddRequest request);

    @PUT("api/BiographyContentTag/edit/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentTagResponse> Edit(@HeaderMap Map<String, String> headers, @Body BiographyContentTagEditRequest request);

    @DELETE("api/BiographyContentTag/delete/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentTagResponse> Delete(@HeaderMap Map<String, String> headers, @Body BiographyContentTagDeleteRequest request);

    @DELETE("api/BiographyContentTag/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentTagResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body BiographyContentTagDeleteListRequest request);

    @POST("api/BiographyContentTag/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<BiographyContentTagResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body BiographyContentTagAddBatchRequest request);
}