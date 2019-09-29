package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseCoreEntity;

public class CoreModuleSaleInvoice extends BaseCoreEntity {

    @SerializedName("LinkSiteIdBuyer")
    public Long LinkSiteIdBuyer;

    @SerializedName("virtual_SiteBuyer")
    public CoreSite virtual_SiteBuyer;

    @SerializedName("SiteBuyer")
    public CoreSite SiteBuyer;

    @SerializedName("HasUsed")
    public Boolean HasUsed;

    @SerializedName("Price")
    public Long Price;

    @SerializedName("LinkModuleSaleSerialId")
    public Long LinkModuleSaleSerialId;

    @SerializedName("virtual_ModuleSaleSerial")
    public CoreModuleSaleSerial virtual_ModuleSaleSerial;

    @SerializedName("ModuleSaleSerial")
    public CoreModuleSaleSerial ModuleSaleSerial;

    @SerializedName("ModuleSaleInvoiceDetails")
    public List<CoreModuleSaleInvoice> ModuleSaleInvoiceDetails;
}