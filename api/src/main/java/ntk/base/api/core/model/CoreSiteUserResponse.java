package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreSiteUser;
import ntk.base.api.baseModel.ErrorException;

public class CoreSiteUserResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSiteUser> ListItems;

    @SerializedName("Item")
    public CoreSiteUser Item;
}
