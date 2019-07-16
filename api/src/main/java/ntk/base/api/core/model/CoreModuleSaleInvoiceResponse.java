package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreModuleSaleInvoice;
import ntk.base.api.model.ErrorException;

public class CoreModuleSaleInvoiceResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreModuleSaleInvoice> ListItems;

    @SerializedName("Item")
    public CoreModuleSaleInvoice Item;
}
