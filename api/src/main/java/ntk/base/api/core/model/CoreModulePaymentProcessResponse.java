package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CorePaymentProcess;
import ntk.base.api.baseModel.ErrorException;

public class CoreModulePaymentProcessResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CorePaymentProcess> ListItems;

    @SerializedName("Item")
    public CorePaymentProcess Item;
}
