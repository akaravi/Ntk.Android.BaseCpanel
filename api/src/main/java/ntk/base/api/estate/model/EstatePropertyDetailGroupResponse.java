package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.estate.entity.EstatePropertyDetailGroup;
import ntk.base.api.baseModel.ErrorException;

public class EstatePropertyDetailGroupResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstatePropertyDetailGroup> ListItems;

    @SerializedName("Item")
    public EstatePropertyDetailGroup Item;
}
