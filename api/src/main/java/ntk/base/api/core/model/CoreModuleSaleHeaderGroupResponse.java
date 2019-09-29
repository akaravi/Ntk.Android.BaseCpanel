package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreModuleSaleHeaderGroup;
import ntk.base.api.baseModel.ErrorException;

public class CoreModuleSaleHeaderGroupResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreModuleSaleHeaderGroup> ListItems;

    @SerializedName("Item")
    public CoreModuleSaleHeaderGroup Item;
}
