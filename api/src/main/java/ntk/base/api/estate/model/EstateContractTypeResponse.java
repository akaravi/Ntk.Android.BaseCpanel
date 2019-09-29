package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.estate.entity.EstateContractType;
import ntk.base.api.baseModel.ErrorException;

public class EstateContractTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstateContractType> ListItems;

    @SerializedName("Item")
    public EstateContractType Item;
}
