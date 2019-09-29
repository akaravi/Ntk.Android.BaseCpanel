package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CorePaymentProcessCustomize;
import ntk.base.api.baseModel.ErrorException;

public class CoreModulePaymentProcessCustomizeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CorePaymentProcessCustomize> ListItems;

    @SerializedName("Item")
    public CorePaymentProcessCustomize Item;
}
