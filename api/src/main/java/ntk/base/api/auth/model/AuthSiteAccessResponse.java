package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthSiteAccessResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthSiteAccess> ListItems;

    @SerializedName("Item")
    public AuthSiteAccess Item;
}
