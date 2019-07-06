package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class MemberCount extends MemberUser {

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;

    @SerializedName("AntiInjectionExpiredMinute")
    public int AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("BirthPlace")
    public String BirthPlace;

    @SerializedName("CreateAntiInjectionValue")
    public Boolean CreateAntiInjectionValue;

    @SerializedName("DateBirth")
    public String DateBirth;

    @SerializedName("Geolocationlatitude")
    public String Geolocationlatitude;

    @SerializedName("DeviceId")
    public String DeviceId;

    @SerializedName("Geolocationlongitude")
    public String Geolocationlongitude;

    @SerializedName("Id")
    public int Id;

    @SerializedName("InstagramId")
    public String InstagramId;

    @SerializedName("JoinId")
    public Long JoinId;

    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkLocationId")
    public String LinkLocationId;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkSiteId")
    public Long LinkSiteId;

    @SerializedName("MemberPropertes")
    public String MemberPropertes;

    @SerializedName("MemberUserGroup")
    public String MemberUserGroup;

    @SerializedName("MemberUserSites")
    public String MemberUserSites;

    @SerializedName("MobileNo")
    public String MobileNo;

    @SerializedName("NationalCode")
    public String NationalCode;

    @SerializedName("OfficeNo")
    public String OfficeNo;

    @SerializedName("OtherInfo")
    public String OtherInfo;

    @SerializedName("TelegramId")
    public String TelegramId;

    @SerializedName("TokenActionState")
    public String TokenActionState;


}