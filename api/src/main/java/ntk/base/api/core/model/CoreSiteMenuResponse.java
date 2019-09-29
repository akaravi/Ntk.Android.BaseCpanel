package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreSiteMenu;
import ntk.base.api.baseModel.ErrorException;

public class CoreSiteMenuResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSiteMenu> ListItems;

    @SerializedName("Item")
    public CoreSiteMenu Item;
}
