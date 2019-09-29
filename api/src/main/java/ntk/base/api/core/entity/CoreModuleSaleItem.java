package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseCoreEntity;

public class CoreModuleSaleItem extends BaseCoreEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Description")
    public String Description;

    @SerializedName("MonthLength")
    public int MonthLength;

    @SerializedName("LinkModuleId")
    public Long LinkModuleId;

    @SerializedName("SalePrice")
    public Long SalePrice;

    @SerializedName("EnumCmsModuleSaleItemType")
    public int EnumCmsModuleSaleItemType;

    @SerializedName("ModuleSiteAccessJsonValue")
    public String ModuleSiteAccessJsonValue;

    @SerializedName("LinkModuleSaleHeader")
    public Long LinkModuleSaleHeader;

    @SerializedName("virtual_CmsModuleSaleHeader")
    public CoreModuleSaleHeaderGroup virtual_CmsModuleSaleHeader;

    @SerializedName("CmsModuleSaleHeader")
    public CoreModuleSaleHeaderGroup CmsModuleSaleHeader;

    @SerializedName("virtual_Module")
    public CoreModule virtual_Module;

    @SerializedName("Module")
    public CoreModule Module;
}