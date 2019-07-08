package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class CoreSelectCurrentSiteResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSelectCurrentSite> ListItems;

    @SerializedName("Item")
    public CoreSelectCurrentSite Item;
}
