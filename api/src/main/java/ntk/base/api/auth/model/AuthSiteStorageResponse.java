package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthSiteStorageResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthSiteStorage> ListItems;

    @SerializedName("Item")
    public AuthSiteStorage Item;
}
