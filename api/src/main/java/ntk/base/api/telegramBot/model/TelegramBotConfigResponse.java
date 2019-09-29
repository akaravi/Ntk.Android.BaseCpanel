package ntk.base.api.telegramBot.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.telegramBot.entity.TelegramBotConfig;

public class TelegramBotConfigResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TelegramBotConfig> ListItems;

    @SerializedName("Item")
    public TelegramBotConfig Item;
}
