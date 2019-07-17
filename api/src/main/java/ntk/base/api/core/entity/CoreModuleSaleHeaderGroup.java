package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class CoreModuleSaleHeaderGroup extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleML")
    public String TitleML;

    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkUserGroupId")
    public Long LinkUserGroupId;

    @SerializedName("virtual_UserGroup")
    public CoreUserGroup virtual_UserGroup;

    @SerializedName("UserGroup")
    public CoreUserGroup UserGroup;

    @SerializedName("LinkCmsSiteCategoryId")
    public Long LinkCmsSiteCategoryId;

    @SerializedName("virtual_SiteCategory")
    public CoreSiteCategory virtual_SiteCategory;

    @SerializedName("SiteCategory")
    public CoreSiteCategory SiteCategory;

    @SerializedName("Headers")
    public List<CoreModuleSaleSerial> Headers;
}