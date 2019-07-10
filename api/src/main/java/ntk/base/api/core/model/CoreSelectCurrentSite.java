package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreSelectCurrentSite {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("LinkSiteId")
    public Long LinkSiteId;

    @SerializedName("LinkUserId")
    public Long LinkUserId;

    @SerializedName("LinkUserGroupId")
    public Long LinkUserGroupId;

    @SerializedName("virtual_CmsSite")
    public CoreSite virtual_CmsSite;

    @SerializedName("CmsSite")
    public String CmsSite;

    @SerializedName("virtual_CmsUser")
    public CoreUser virtual_CmsUser;

    @SerializedName("CmsUser")
    public String CmsUser;

    @SerializedName("Id")
    public String Id;

    @SerializedName("virtual_CmsUserGroup")
    public String virtual_CmsUserGroup;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("CreateAntiInjectionValue")
    public Boolean CreateAntiInjectionValue;

    @SerializedName("TokenActionState")
    public int TokenActionState;

    @SerializedName("AntiInjectionExpiredMinute")
    public int AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;
}