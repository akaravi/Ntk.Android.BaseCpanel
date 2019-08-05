package ntk.base.api.telegramBot.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.telegramBot.model.TelegramBotConfigAddRequest;
import ntk.base.api.telegramBot.model.TelegramBotConfigDeleteRequest;
import ntk.base.api.telegramBot.model.TelegramBotConfigEditRequest;
import ntk.base.api.telegramBot.model.TelegramBotConfigResponse;
import ntk.base.api.telegramBot.model.TelegramBotCountRequest;
import ntk.base.api.telegramBot.model.TelegramBotExportFileRequest;
import ntk.base.api.telegramBot.model.TelegramBotGetAllRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ITelegramBotConfig {

    @POST("api/TelegramBotConfig/getall/")
    @Headers({"content-type: application/json"})
    Observable<TelegramBotConfigResponse> GetAll(@HeaderMap Map<String, String> headers, @Body TelegramBotGetAllRequest request);

    @GET("api/TelegramBotConfig/getviewmodel/")
    @Headers({"content-type: application/json"})
    Observable<TelegramBotConfigResponse> GetViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/TelegramBotConfig/Add/")
    @Headers({"content-type: application/json"})
    Observable<TelegramBotConfigResponse> Add(@HeaderMap Map<String, String> headers, @Body TelegramBotConfigAddRequest request);

    @PUT("api/TelegramBotConfig/Edit/")
    @Headers({"content-type: application/json"})
    Observable<TelegramBotConfigResponse> Edit(@HeaderMap Map<String, String> headers, @Body TelegramBotConfigEditRequest request);

    @DELETE("api/TelegramBotConfig/Delete/")
    @Headers({"content-type: application/json"})
    Observable<TelegramBotConfigResponse> Delete(@HeaderMap Map<String, String> headers, @Body TelegramBotConfigDeleteRequest request);

    @POST("api/TelegramBotConfig/ExportFile/")
    @Headers({"content-type: application/json"})
    Observable<TelegramBotConfigResponse> ExportFile(@HeaderMap Map<String, String> headers, @Body TelegramBotExportFileRequest request);

    @POST("api/TelegramBotConfig/count/")
    @Headers({"content-type: application/json"})
    Observable<TelegramBotConfigResponse> Count(@HeaderMap Map<String, String> headers, @Body TelegramBotCountRequest request);
}
