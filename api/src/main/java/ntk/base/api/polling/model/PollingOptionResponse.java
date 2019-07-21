package ntk.base.api.polling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.polling.entity.PollingOption;

public class PollingOptionResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PollingOption> ListItems;

    @SerializedName("Item")
    public PollingOption Item;
}
