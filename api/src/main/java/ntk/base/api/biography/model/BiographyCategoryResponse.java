package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyCategory;
import ntk.base.api.model.ErrorException;

public class BiographyCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyCategory> ListItems;

    @SerializedName("Item")
    public BiographyCategory Item;
}
