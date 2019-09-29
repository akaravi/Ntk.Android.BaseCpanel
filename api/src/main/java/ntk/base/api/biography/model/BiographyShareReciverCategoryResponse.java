package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyShareReciverCategory;
import ntk.base.api.baseModel.ErrorException;

public class BiographyShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyShareReciverCategory> ListItems;

    @SerializedName("Item")
    public BiographyShareReciverCategory Item;
}
