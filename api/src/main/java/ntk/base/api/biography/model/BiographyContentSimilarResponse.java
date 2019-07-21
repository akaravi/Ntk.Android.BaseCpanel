package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyContentSimilar;
import ntk.base.api.model.ErrorException;

public class BiographyContentSimilarResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContentSimilar> ListItems;

    @SerializedName("Item")
    public BiographyContentSimilar Item;
}
