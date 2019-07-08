package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCommentAddRequest;
import ntk.base.api.news.model.NewsCommentCountRequest;
import ntk.base.api.news.model.NewsCommentDeleteRequest;
import ntk.base.api.news.model.NewsCommentEditRequest;
import ntk.base.api.news.model.NewsCommentExportFileRequest;
import ntk.base.api.news.model.NewsCommentGetAllRequest;
import ntk.base.api.news.model.NewsCommentGetViewModelRequest;
import ntk.base.api.news.model.NewsCommentResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface INewsComment {

    @POST("api/newsComment/getall/")
    @Headers({"content-type: application/json"})
    Observable<NewsCommentResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsCommentGetAllRequest request);

    @GET("api/newsComment/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<NewsCommentResponse> GetViewModel(@HeaderMap Map<String, String> headers, @Body NewsCommentGetViewModelRequest request);

    @POST("api/newsComment/Add/")
    @Headers({"content-type: application/json"})
    Observable<NewsCommentResponse> Add(@HeaderMap Map<String, String> headers, @Body NewsCommentAddRequest request);

    @PUT("api/newsComment/Edit/")
    @Headers({"content-type: application/json"})
    Observable<NewsCommentResponse> Edit(@HeaderMap Map<String, String> headers, @Body NewsCommentEditRequest request);

    @DELETE("api/newsComment/Delete/")
    @Headers({"content-type: application/json"})
    Observable<NewsCommentResponse> Delete(@HeaderMap Map<String, String> headers, @Body NewsCommentDeleteRequest request);

    @POST("api/newsComment/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<NewsCommentResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body NewsCommentExportFileRequest request);

    @POST("api/newsComment/count/")
    @Headers({"content-type: application/json"})
    Observable<NewsCommentResponse> Count(@HeaderMap Map<String, String> headers, @Body NewsCommentCountRequest request);
}