package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.estate.entity.EstatePropertyDetailValue;
import ntk.base.api.model.ErrorException;

public class EstatePropertyDetailValueResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstatePropertyDetailValue> ListItems;

    @SerializedName("Item")
    public EstatePropertyDetailValue Item;
}
