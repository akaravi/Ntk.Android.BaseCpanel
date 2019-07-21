package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class EstatePropertyDetailValue extends BaseModuleEntity {

    @SerializedName("LinkPropertyId")
    public Long LinkPropertyId;

    @SerializedName("LinkPropertyDetailId")
    public Long LinkPropertyDetailId;

    @SerializedName("Value")
    public String Value;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Property")
    public EstateProperty Property;

    @SerializedName("PropertyDetail")
    public EstatePropertyDetail PropertyDetail;

    @SerializedName("PropertyDetailDefaultValue")
    public List<EstatePropertyDetailDefaultValue> PropertyDetailDefaultValue;
}