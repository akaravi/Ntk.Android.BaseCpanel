package ntk.base.api.estate.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.estate.model.EstateCountRequest;
import ntk.base.api.estate.model.EstateExportFileRequest;
import ntk.base.api.estate.model.EstateGetAllRequest;
import ntk.base.api.estate.model.EstatePropertyFavoriteAddRequest;
import ntk.base.api.estate.model.EstatePropertyFavoriteDeleteRequest;
import ntk.base.api.estate.model.EstatePropertyFavoriteEditRequest;
import ntk.base.api.estate.model.EstatePropertyFavoriteResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IEstatePropertyFavorite {

    @POST("api/EstatePropertyFavorite/getall/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyFavoriteResponse> GetAll(@HeaderMap Map<String, String> headers, @Body EstateGetAllRequest request);

    @GET("api/EstatePropertyFavorite/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyFavoriteResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/EstatePropertyFavorite/Add/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyFavoriteResponse> Add(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteAddRequest request);

    @PUT("api/EstatePropertyFavorite/Edit/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyFavoriteResponse> Edit(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteEditRequest request);

    @DELETE("api/EstatePropertyFavorite/Delete/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyFavoriteResponse> Delete(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteDeleteRequest request);

    @POST("api/EstatePropertyFavorite/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyFavoriteResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body EstateExportFileRequest request);

    @POST("api/EstatePropertyFavorite/count/")
    @Headers({"content-type: application/json"})
    Observable<EstatePropertyFavoriteResponse> Count(@HeaderMap Map<String, String> headers, @Body EstateCountRequest request);
}

