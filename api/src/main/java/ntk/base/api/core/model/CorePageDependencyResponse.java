package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CorePageDependency;
import ntk.base.api.model.ErrorException;

public class CorePageDependencyResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CorePageDependency> ListItems;

    @SerializedName("Item")
    public CorePageDependency Item;
}
