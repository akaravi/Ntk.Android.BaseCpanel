package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class EstatePropertyDetail extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("IconFont")
    public String IconFont;

    @SerializedName("InputDataType")
    public int InputDataType;

    @SerializedName("Unit")
    public String Unit;

    @SerializedName("UiDesignType")
    public int UiDesignType;

    @SerializedName("UiDesignColor")
    public String UiDesignColor;

    @SerializedName("InvisibleForEndUser")
    public Boolean InvisibleForEndUser;

    @SerializedName("InvisibleForSubmiter")
    public Boolean InvisibleForSubmiter;

    @SerializedName("Required")
    public Boolean Required;

    @SerializedName("IsSearchable")
    public Boolean IsSearchable;

    @SerializedName("LinkPropertyDetailGroupId")
    public Long LinkPropertyDetailGroupId;

    @SerializedName("virtual_PropertyDetailGroup")
    public EstatePropertyDetailGroup virtual_PropertyDetailGroup;

    @SerializedName("PropertyDetailGroup")
    public EstatePropertyDetailGroup PropertyDetailGroup;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId;

    @SerializedName("virtual_PropertyType")
    public EstatePropertyType virtual_PropertyType;

    @SerializedName("PropertyType")
    public EstatePropertyType PropertyType;

    @SerializedName("ShowInFormOrder")
    public Long ShowInFormOrder;

    @SerializedName("JsonDefaultValue")
    public String JsonDefaultValue;

    @SerializedName("DefaultValue")
    public EstatePropertyDetailDefaultValue DefaultValue;
}