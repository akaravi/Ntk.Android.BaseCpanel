package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCategoryAddRequest;
import ntk.base.api.news.model.NewsCategoryDeleteRequest;
import ntk.base.api.news.model.NewsCategoryEditRequest;
import ntk.base.api.news.model.NewsCategoryGetAllRequest;
import ntk.base.api.news.model.NewsCategoryGetViewModelRequest;
import ntk.base.api.news.model.NewsCategoryNewsCategoryRequest;
import ntk.base.api.news.model.NewsCategoryResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsCategory {

    @POST("api/newscategory/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsCategoryResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsCategoryGetAllRequest request);

    @GET("api/newscategory/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsCategoryResponse> GetViewModel(@HeaderMap Map<String, String> headers, @Body NewsCategoryGetViewModelRequest request);

    @POST("api/newscategory/add/")
    @Headers({"content-type: application/json"})
    Observable<NewsCategoryResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsCategoryAddRequest request);

    @POST("api/newscategory/")
    @Headers({"content-type: application/json"})
    Observable<NewsCategoryResponse> NewsCategory(@HeaderMap Map<String, String> headers, @Body NewsCategoryNewsCategoryRequest request);

    @PUT("api/newscategory/edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsCategoryResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsCategoryEditRequest request);

    @DELETE("api/newscategory/delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsCategoryResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsCategoryDeleteRequest request);
}
