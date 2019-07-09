package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCountRequest;
import ntk.base.api.news.model.NewsExportFileRequest;
import ntk.base.api.news.model.NewsGetAllRequest;
import ntk.base.api.news.model.NewsSharingCategoryAddRequest;
import ntk.base.api.news.model.NewsSharingCategoryDeleteRequest;
import ntk.base.api.news.model.NewsSharingCategoryEditRequest;
import ntk.base.api.news.model.NewsSharingCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsSharingCategory {

    @POST("api/newssharingcategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsSharingCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsGetAllRequest request);

    @GET("api/newssharingcategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsSharingCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/newssharingcategory/Add/")
    @Headers({"content-type: application/json"})
    Observable<NewsSharingCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsSharingCategoryAddRequest request);

    @PUT("api/newssharingcategory/Edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsSharingCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsSharingCategoryEditRequest request);

    @DELETE("api/newssharingcategory/Delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsSharingCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsSharingCategoryDeleteRequest request);

    @POST("api/newssharingcategory/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<NewsSharingCategoryResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body NewsExportFileRequest request);

    @POST("api/newssharingcategory/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsSharingCategoryResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCountRequest request);
}
