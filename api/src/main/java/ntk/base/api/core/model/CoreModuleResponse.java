package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreModule;
import ntk.base.api.baseModel.ErrorException;

public class CoreModuleResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreModule> ListItems;

    @SerializedName("Item")
    public CoreModule Item;
}
