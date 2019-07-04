package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthSearchNewResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthSearchNew> ListItems;

    @SerializedName("Item")
    public AuthSearchNew Item;
}
