package ntk.base.api.shop.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.shop.model.ShopCountRequest;
import ntk.base.api.shop.model.ShopCountResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IShop {

    @POST("api/shopinvoicesale/count/")
    @Headers({"content-type: application/json"})
    Observable<ShopCountResponse> GetShopCount(@HeaderMap Map<String, String> headers, @Body ShopCountRequest request);
}
