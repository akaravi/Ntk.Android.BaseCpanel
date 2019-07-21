package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.estate.entity.EstatePropertyFavorite;
import ntk.base.api.model.ErrorException;

public class EstatePropertyFavoriteResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstatePropertyFavorite> ListItems;

    @SerializedName("Item")
    public EstatePropertyFavorite Item;
}
