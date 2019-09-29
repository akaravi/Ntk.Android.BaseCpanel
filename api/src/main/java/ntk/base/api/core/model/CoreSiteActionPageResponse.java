package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreSiteActionPage;
import ntk.base.api.baseModel.ErrorException;

public class CoreSiteActionPageResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSiteActionPage> ListItems;

    @SerializedName("Item")
    public CoreSiteActionPage Item;
}
