package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthClearTokenResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthUser> ListItems;

    @SerializedName("Item")
    public AuthUser Item;
}
