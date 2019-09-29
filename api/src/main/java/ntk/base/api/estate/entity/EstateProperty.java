package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class EstateProperty extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkLocationId")
    public Long LinkLocationId;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId;

    @SerializedName("virtual_PropertyType")
    public EstatePropertyType virtual_PropertyType;

    @SerializedName("PropertyType")
    public EstatePropertyType PropertyType;

    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;

    @SerializedName("Address")
    public String Address;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkExtraImageIds")
    public String LinkExtraImageIds;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("ScoreClick")
    public int ScoreClick;

    @SerializedName("ScoreSumPercent")
    public int ScoreSumPercent;

    @SerializedName("ViewCount")
    public int ViewCount;

    @SerializedName("virtual_Contracts")
    public List<EstateContract> virtual_Contracts;

    @SerializedName("Contracts")
    public List<EstateContract> Contracts;

    @SerializedName("virtual_PropertyDetailValue")
    public List<EstatePropertyDetailValue> virtual_PropertyDetailValue;

    @SerializedName("PropertyDetailValue")
    public List<EstatePropertyDetailValue> PropertyDetailValue;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;

    @SerializedName("LinkExtraImageIdsSrc")
    public List<String> LinkExtraImageIdsSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}