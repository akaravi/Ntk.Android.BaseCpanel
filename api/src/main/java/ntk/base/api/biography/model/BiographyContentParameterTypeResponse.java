package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyContentParameterType;
import ntk.base.api.model.ErrorException;

public class BiographyContentParameterTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContentParameterType> ListItems;

    @SerializedName("Item")
    public BiographyContentParameterType Item;
}
