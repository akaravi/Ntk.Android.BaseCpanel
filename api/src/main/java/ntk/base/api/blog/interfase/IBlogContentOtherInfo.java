package ntk.base.api.blog.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.blog.model.BlogContentOtherInfoAddBatchRequest;
import ntk.base.api.blog.model.BlogContentOtherInfoDeleteListRequest;
import ntk.base.api.blog.model.BlogContentOtherInfoEditBatchRequest;
import ntk.base.api.blog.model.BlogContentOtherInfoResponse;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IBlogContentOtherInfo {

    @DELETE("api/BlogContentOtherInfo/DeleteList/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentOtherInfoResponse> DeleteList(@HeaderMap Map<String, String> headers, @Body BlogContentOtherInfoDeleteListRequest request);

    @POST("api/BlogContentOtherInfo/addbatch/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentOtherInfoResponse> AddBatch(@HeaderMap Map<String, String> headers, @Body BlogContentOtherInfoAddBatchRequest request);

    @PUT("api/BlogContentOtherInfo/editbatch/")
    @Headers({"content-type: application/json"})
    Observable<BlogContentOtherInfoResponse> EditBatch(@HeaderMap Map<String, String> headers, @Body BlogContentOtherInfoEditBatchRequest request);
}
