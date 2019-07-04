package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class AuthArticleCountResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<AuthCount> ListItems;

    @SerializedName("Item")
    public AuthCount Item;
}
