package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthSelectCurrentSiteResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthSelectCurrentSite> ListItems;

    @SerializedName("Item")
    public AuthSelectCurrentSite Item;
}
