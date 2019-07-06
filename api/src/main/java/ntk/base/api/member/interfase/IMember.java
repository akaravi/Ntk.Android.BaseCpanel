package ntk.base.api.member.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.member.model.MemberCountRequest;
import ntk.base.api.member.model.MemberCountResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IMember {

    @POST("api/api/memberUser/count/")
    @Headers({"content-type: application/json"})
    Observable<MemberCountResponse> GetMemberCount(@HeaderMap Map<String, String> headers, @Body MemberCountRequest request);
}
