package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthAllMenuResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthAllMenu> ListItems;

    @SerializedName("Item")
    public AuthAllMenu Item;
}
