package ntk.base.api.chart.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.chart.model.ChartCountRequest;
import ntk.base.api.chart.model.ChartCountResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IChart {

    @POST("api/chartContent/count/")
    @Headers({"content-type: application/json"})
    Observable<ChartCountResponse> GetChartCount(@HeaderMap Map<String, String> headers, @Body ChartCountRequest request);
}
