package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreSiteCategory;
import ntk.base.api.baseModel.ErrorException;

public class CoreSiteCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSiteCategory> ListItems;

    @SerializedName("Item")
    public CoreSiteCategory Item;
}
