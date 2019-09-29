package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class CoreSiteUser extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("LinkUserId")
    public Long LinkUserId;

    @SerializedName("LinkUserGroupId")
    public Long LinkUserGroupId;

    @SerializedName("virtual_CmsSite")
    public CoreSite virtual_CmsSite;

    @SerializedName("CmsSite")
    public CoreSite CmsSite;

    @SerializedName("virtual_CmsUser")
    public CoreUser virtual_CmsUser;

    @SerializedName("CmsUser")
    public CoreUser CmsUser;

    @SerializedName("virtual_CmsUserGroup")
    public CoreUserGroup virtual_CmsUserGroup;

    @SerializedName("CmsUserGroup")
    public CoreUserGroup CmsUserGroup;
}