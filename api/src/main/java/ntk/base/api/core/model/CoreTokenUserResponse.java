package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreTokenUser;
import ntk.base.api.model.ErrorException;

public class CoreTokenUserResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreTokenUser> ListItems;

    @SerializedName("Item")
    public CoreTokenUser Item;
}
