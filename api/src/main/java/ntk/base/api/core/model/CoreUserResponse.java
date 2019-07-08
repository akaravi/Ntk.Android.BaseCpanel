package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class CoreUserResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreUser> ListItems;

    @SerializedName("Item")
    public CoreUser Item;
}
