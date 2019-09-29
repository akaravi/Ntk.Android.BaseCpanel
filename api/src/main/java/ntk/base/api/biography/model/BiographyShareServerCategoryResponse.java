package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyShareServerCategory;
import ntk.base.api.baseModel.ErrorException;

public class BiographyShareServerCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyShareServerCategory> ListItems;

    @SerializedName("Item")
    public BiographyShareServerCategory Item;
}
