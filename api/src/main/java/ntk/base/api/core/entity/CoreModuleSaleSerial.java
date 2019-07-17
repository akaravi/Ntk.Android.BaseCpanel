package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseCoreEntity;

public class CoreModuleSaleSerial extends BaseCoreEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Price")
    public Long Price;

    @SerializedName("HasUsed")
    public boolean HasUsed;

    @SerializedName("HasDemo")
    public boolean HasDemo;

    @SerializedName("SerialNumber")
    public String SerialNumber;

    @SerializedName("PwdForUse")
    public String PwdForUse;

    @SerializedName("NumberOfMaxUse")
    public int NumberOfMaxUse;

    @SerializedName("MaxExpireToUse")
    public String MaxExpireToUse;

    @SerializedName("NumberOfRegistered")
    public int NumberOfRegistered;

    @SerializedName("LinkSiteIdDeposit")
    public Long LinkSiteIdDeposit;

    @SerializedName("virtual_SiteDeposit")
    public CoreSite virtual_SiteDeposit;

    @SerializedName("SiteDeposit")
    public CoreSite SiteDeposit;

    @SerializedName("LinkModuleSaleHeaderId")
    public Long LinkModuleSaleHeaderId;

    @SerializedName("LinkSiteIdBuyer")
    public Long LinkSiteIdBuyer;

    @SerializedName("virtual_ModuleSaleHeader")
    public CoreModuleSaleItem virtual_ModuleSaleHeader;

    @SerializedName("ModuleSaleHeader")
    public CoreModuleSaleItem ModuleSaleHeader;

    @SerializedName("ModuleSaleInvoices")
    public List<CoreModuleSaleInvoice> ModuleSaleInvoices;
}
