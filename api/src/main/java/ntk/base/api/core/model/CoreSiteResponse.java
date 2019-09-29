package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreSite;
import ntk.base.api.baseModel.ErrorException;

public class CoreSiteResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSite> ListItems;

    @SerializedName("Item")
    public CoreSite Item;
}
