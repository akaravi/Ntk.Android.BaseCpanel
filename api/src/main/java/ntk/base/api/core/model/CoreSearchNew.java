package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

class CoreSearchNew extends BaseEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("SubDomain")
    public String SubDomain;

    @SerializedName("Domain")
    public String Domain;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Id")
    public Long Id;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("Geolocationlatitude")
    public String Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public String Geolocationlongitude;

    @SerializedName("CreateAntiInjectionValue")
    public Boolean CreateAntiInjectionValue;

    @SerializedName("TokenActionState")
    public int TokenActionState;

    @SerializedName("AntiInjectionExpiredMinute")
    public Long AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;
}
