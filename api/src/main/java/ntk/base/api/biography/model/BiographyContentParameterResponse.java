package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyContentParameter;
import ntk.base.api.model.ErrorException;

public class BiographyContentParameterResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContentParameter> ListItems;

    @SerializedName("Item")
    public BiographyContentParameter Item;
}
