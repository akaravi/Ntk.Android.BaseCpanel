package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyContentTag;
import ntk.base.api.baseModel.ErrorException;

public class BiographyContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContentTag> ListItems;

    @SerializedName("Item")
    public BiographyContentTag Item;
}
