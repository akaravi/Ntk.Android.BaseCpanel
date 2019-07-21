package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyTag;
import ntk.base.api.model.ErrorException;

public class BiographyTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyTag> ListItems;

    @SerializedName("Item")
    public BiographyTag Item;
}
