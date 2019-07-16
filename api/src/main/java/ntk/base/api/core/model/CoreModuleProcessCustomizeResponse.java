package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreModuleProcessCustomize;
import ntk.base.api.model.ErrorException;

public class CoreModuleProcessCustomizeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreModuleProcessCustomize> ListItems;

    @SerializedName("Item")
    public CoreModuleProcessCustomize Item;
}
