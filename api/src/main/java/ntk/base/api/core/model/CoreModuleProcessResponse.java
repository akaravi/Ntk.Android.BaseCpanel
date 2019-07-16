package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreModuleProcess;
import ntk.base.api.model.ErrorException;

public class CoreModuleProcessResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreModuleProcess> ListItems;

    @SerializedName("Item")
    public CoreModuleProcess Item;
}
