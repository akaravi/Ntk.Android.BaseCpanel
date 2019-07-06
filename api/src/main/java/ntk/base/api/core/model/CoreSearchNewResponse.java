package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class CoreSearchNewResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSearchNew> ListItems;

    @SerializedName("Item")
    public CoreSearchNew Item;
}
