package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreModuleSaleSerial;
import ntk.base.api.model.ErrorException;

public class CoreModuleSaleSerialResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreModuleSaleSerial> ListItems;

    @SerializedName("Item")
    public CoreModuleSaleSerial Item;
}
