package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreUserBadLogin;
import ntk.base.api.model.ErrorException;

public class CoreUserBadLoginResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreUserBadLogin> ListItems;

    @SerializedName("Item")
    public CoreUserBadLogin Item;
}
