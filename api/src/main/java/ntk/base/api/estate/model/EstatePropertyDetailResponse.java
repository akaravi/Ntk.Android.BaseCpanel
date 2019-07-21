package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.estate.entity.EstatePropertyDetail;
import ntk.base.api.model.ErrorException;

public class EstatePropertyDetailResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstatePropertyDetail> ListItems;

    @SerializedName("Item")
    public EstatePropertyDetail Item;
}
