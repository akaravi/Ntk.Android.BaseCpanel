package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class CoreLocation extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;

    @SerializedName("GeoLocationLatitude")
    public String GeoLocationLatitude;

    @SerializedName("GeoLocationLongitude")
    public String GeoLocationLongitude;

    @SerializedName("LocationType")
    public int LocationType;

    @SerializedName("virtual_Parent")
    public CoreLocation virtual_Parent;

    @SerializedName("Parent")
    public CoreLocation Parent;

    @SerializedName("Children")
    public List<CoreLocation> Children;
}