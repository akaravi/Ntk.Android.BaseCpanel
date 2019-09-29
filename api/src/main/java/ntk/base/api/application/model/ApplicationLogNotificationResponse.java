package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.application.entity.ApplicationLogNotification;
import ntk.base.api.baseModel.ErrorException;

public class ApplicationLogNotificationResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ApplicationLogNotification> ListItems;

    @SerializedName("Item")
    public ApplicationLogNotification Item;
}
