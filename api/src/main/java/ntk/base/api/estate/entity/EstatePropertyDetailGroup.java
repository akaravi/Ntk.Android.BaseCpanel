package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class EstatePropertyDetailGroup extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("IconFont")
    public String IconFont;

    @SerializedName("ShowInFormOrder")
    public Long ShowInFormOrder;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId;

    @SerializedName("virtual_PropertyType")
    public EstatePropertyType virtual_PropertyType;

    @SerializedName("PropertyType")
    public EstatePropertyType PropertyType;
}