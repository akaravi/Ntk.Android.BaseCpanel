package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseCoreEntity;

public class CoreAllWithAlias extends BaseCoreEntity {

    @SerializedName("LinkCreatedBySiteId")
    public int LinkCreatedBySiteId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("OwnerSiteSetStatus")
    public int OwnerSiteSetStatus;

    @SerializedName("UserLanguage")
    public int UserLanguage;

    @SerializedName("SubDomain")
    public String SubDomain;

    @SerializedName("Domain")
    public String Domain;

    @SerializedName("LinkSiteCategoryId")
    public int LinkSiteCategoryId;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;

    @SerializedName("Id")
    public Long Id;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("CreateAntiInjectionValue")
    public Boolean CreateAntiInjectionValue;

    @SerializedName("TokenActionState")
    public int TokenActionState;

    @SerializedName("AntiInjectionExpiredMinute")
    public Long AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;
}
