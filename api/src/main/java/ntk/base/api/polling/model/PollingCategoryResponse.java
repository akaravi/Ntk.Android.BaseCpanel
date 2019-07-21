package ntk.base.api.polling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.polling.entity.PollingCategory;

public class PollingCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PollingCategory> ListItems;

    @SerializedName("Item")
    public PollingCategory Item;
}
