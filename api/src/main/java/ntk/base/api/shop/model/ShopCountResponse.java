package ntk.base.api.shop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ShopCountResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ShopCount> ListItems;

    @SerializedName("Item")
    public ShopCount Item;
}
