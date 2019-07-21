package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class EstatePropertyType extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkLocationId")
    public Long LinkLocationId;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("virtual_PropertyDetails")
    public List<EstatePropertyDetail> virtual_PropertyDetails;

    @SerializedName("PropertyDetails")
    public List<EstatePropertyDetail> PropertyDetails;
}