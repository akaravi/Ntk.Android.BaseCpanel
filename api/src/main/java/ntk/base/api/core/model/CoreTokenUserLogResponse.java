package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreTokenUserLog;
import ntk.base.api.model.ErrorException;

public class CoreTokenUserLogResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreTokenUserLog> ListItems;

    @SerializedName("Item")
    public CoreTokenUserLog Item;
}
