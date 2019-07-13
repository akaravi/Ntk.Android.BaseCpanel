package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationCountRequest;
import ntk.base.api.application.model.ApplicationExportFileRequest;
import ntk.base.api.application.model.ApplicationGetAllRequest;
import ntk.base.api.application.model.ApplicationLogNotificationResponse;
import ntk.base.api.application.model.ApplicationSendNotificationRequest;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IApplicationLogNotification {

    @POST("api/ApplicationLogNotification/getall/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLogNotificationResponse> GetAll(@HeaderMap Map<String, String> headers, @Body ApplicationGetAllRequest request);

    @POST("api/ApplicationLogNotification/exportfile/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLogNotificationResponse> exportFile(@HeaderMap Map<String, String> headers, @Body ApplicationExportFileRequest request);

    @POST("api/ApplicationLogNotification/count/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLogNotificationResponse> Count(@HeaderMap Map<String, String> headers, @Body ApplicationCountRequest request);

    @POST("api/ApplicationLogNotification/SendNotification/")
    @Headers({"content-type: application/json"})
    Observable<ApplicationLogNotificationResponse> SendNotification(@HeaderMap Map<String, String> headers, @Body ApplicationSendNotificationRequest request);


}
