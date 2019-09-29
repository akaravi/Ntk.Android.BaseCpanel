package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class EstateContract extends BaseModuleEntity {

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkEstateContractTypeId")
    public Long LinkEstateContractTypeId;

    @SerializedName("virtual_ContractType")
    public EstateContractType virtual_ContractType;

    @SerializedName("ContractType")
    public EstateContractType ContractType;

    @SerializedName("LinkPropertyId")
    public Long LinkPropertyId;

    @SerializedName("virtual_Property")
    public EstateProperty virtual_Property;

    @SerializedName("Property")
    public EstateProperty Property;

    @SerializedName("SalePrice")
    public double SalePrice;

    @SerializedName("PresalePrice")
    public double PresalePrice;

    @SerializedName("RentPrice")
    public double RentPrice;

    @SerializedName("DepositPrice")
    public double DepositPrice;
}