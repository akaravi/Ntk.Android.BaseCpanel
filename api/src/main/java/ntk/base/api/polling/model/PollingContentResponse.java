package ntk.base.api.polling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.polling.entity.PollingContent;

public class PollingContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PollingContent> ListItems;

    @SerializedName("Item")
    public PollingContent Item;
}
