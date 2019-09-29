package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class EstateContractType extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("HasSalePrice")
    public Boolean HasSalePrice;

    @SerializedName("HasPresalePrice")
    public Boolean HasPresalePrice;

    @SerializedName("HasRentPrice")
    public Boolean HasRentPrice;

    @SerializedName("HasDepositPrice")
    public Boolean HasDepositPrice;

    @SerializedName("UnitSalePrice")
    public String UnitSalePrice;

    @SerializedName("UnitPresalePrice")
    public String UnitPresalePrice;

    @SerializedName("UnitRentPrice")
    public String UnitRentPrice;

    @SerializedName("UnitDepositPrice")
    public String UnitDepositPrice;
}