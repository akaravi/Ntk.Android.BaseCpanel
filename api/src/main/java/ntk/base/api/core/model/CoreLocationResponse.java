package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreLocation;
import ntk.base.api.baseModel.ErrorException;

public class CoreLocationResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreLocation> ListItems;

    @SerializedName("Item")
    public CoreLocation Item;
}
