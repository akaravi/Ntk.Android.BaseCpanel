package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthAllWithAliasResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthAllWithAlias> ListItems;

    @SerializedName("Item")
    public AuthAllWithAlias Item;
}
