package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class AuthSelectCurrentSite extends BaseEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("LinkSiteId")
    public Long LinkSiteId;

    @SerializedName("LinkUserId")
    public Long LinkUserId;

    @SerializedName("LinkUserGroupId")
    public Long LinkUserGroupId;

    @SerializedName("virtual_CmsSite")
    public AuthSite virtual_CmsSite;

    @SerializedName("CmsSite")
    public String CmsSite;

    @SerializedName("virtual_CmsUser")
    public AuthUser virtual_CmsUser;

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
