package ntk.base.api.polling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.polling.entity.PollingLog;

public class PollingLogResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PollingLog> ListItems;

    @SerializedName("Item")
    public PollingLog Item;
}
