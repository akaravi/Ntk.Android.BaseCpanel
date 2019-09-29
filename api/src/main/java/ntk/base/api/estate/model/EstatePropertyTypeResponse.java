package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.estate.entity.EstatePropertyType;
import ntk.base.api.baseModel.ErrorException;

public class EstatePropertyTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstatePropertyType
            > ListItems;

    @SerializedName("Item")
    public EstatePropertyType
            Item;
}
