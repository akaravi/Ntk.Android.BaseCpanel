package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.estate.entity.EstateContract;
import ntk.base.api.model.ErrorException;

public class EstateContractResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstateContract> ListItems;

    @SerializedName("Item")
    public EstateContract Item;
}
