package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsContentOtherInfoAddBatchRequest;
import ntk.base.api.news.model.NewsContentOtherInfoDeleteListRequest;
import ntk.base.api.news.model.NewsContentOtherInfoGetAllRequest;
import ntk.base.api.news.model.NewsContentOtherInfoResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface INewsContentOtherInfo {

    @POST("api/newsContentOtherInfo/GetAll/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentOtherInfoResponse> GetAll(@HeaderMap Map<String, String> headers, @Body NewsContentOtherInfoGetAllRequest request);

    @DELETE("api/newsContentOtherInfo/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentOtherInfoResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body NewsContentOtherInfoDeleteListRequest request);

    @POST("api/newsContentOtherInfo/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<NewsContentOtherInfoResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body NewsContentOtherInfoAddBatchRequest request);
}
