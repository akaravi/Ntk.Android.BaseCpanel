package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ApplicationMemberInfo extends BaseModuleEntity {

    @SerializedName("LinkUserId")
    public Long LinkUserId;

    @SerializedName("LinkMemberId")
    public Long LinkMemberId;

    @SerializedName("DeviceStatus")
    public int DeviceStatus;

    @SerializedName("DeviceId")
    public String DeviceId;

    @SerializedName("DeviceBrand")
    public String DeviceBrand;

    @SerializedName("SimCard")
    public String SimCard;

    @SerializedName("Country")
    public String Country;

    @SerializedName("Language")
    public String Language;

    @SerializedName("NotificationId")
    public String NotificationId;

    @SerializedName("LinkApplicationId")
    public Long LinkApplicationId;

    @SerializedName("AppBuildVer")
    public Long AppBuildVer;

    @SerializedName("AppSourceVer")
    public String AppSourceVer;

    @SerializedName("DeviceIP")
    public String DeviceIP;

    @SerializedName("LocationLat")
    public String LocationLat;

    @SerializedName("LocationLong")
    public String LocationLong;

    @SerializedName("ScorePercent")
    public int ScorePercent;

    @SerializedName("ScoreComment")
    public String ScoreComment;
}