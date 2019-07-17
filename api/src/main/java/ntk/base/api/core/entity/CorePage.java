package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class CorePage extends BaseModuleEntity {

    @SerializedName("LinkFavFileId")
    public Long LinkFavFileId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Keyword")
    public String Keyword;

    @SerializedName("Description")
    public String Description;

    @SerializedName("PageDependencyIsDefualtPage")
    public Boolean PageDependencyIsDefualtPage;

    @SerializedName("PageJsonValue")
    public String PageJsonValue;

    @SerializedName("PageAbilityType")
    public int PageAbilityType;

    @SerializedName("Export1")
    public String Export1;

    @SerializedName("Export2")
    public String Export2;

    @SerializedName("Export3")
    public String Export3;

    @SerializedName("LinkCmsPageId")
    public Long LinkCmsPageId;

    @SerializedName("virtual_CmsParentPage")
    public CorePage virtual_CmsParentPage;

    @SerializedName("CmsParentPage")
    public CorePage CmsParentPage;

    @SerializedName("PageJsonValueDefualtByAdmin")
    public String PageJsonValueDefualtByAdmin;

    @SerializedName("PageJsonValueDefualtByAdminDateTimeUpdate")
    public String PageJsonValueDefualtByAdminDateTimeUpdate;

    @SerializedName("HtmlValue")
    public String HtmlValue;

    @SerializedName("RenderVersion")
    public String RenderVersion;

    @SerializedName("SpecialIdendity")
    public Long SpecialIdendity;

    @SerializedName("SpecialUrlParameter")
    public Long SpecialUrlParameter;

    @SerializedName("LinkPageDependencyId")
    public Long LinkPageDependencyId;

    @SerializedName("LinkPageTemplateId")
    public Long LinkPageTemplateId;

    @SerializedName("virtual_CmsPageTemplate")
    public CorePageTemplate virtual_CmsPageTemplate;

    @SerializedName("CmsPageTemplate")
    public CorePageTemplate CmsPageTemplate;

    @SerializedName("virtual_CmsModulePageDependency")
    public CorePageDependency virtual_CmsModulePageDependency;

    @SerializedName("CmsModulePageDependency")
    public CorePageDependency CmsModulePageDependency;

    @SerializedName("virtual_CmsSite")
    public CoreSite virtual_CmsSite;

    @SerializedName("CmsSite")
    public CoreSite CmsSite;

    @SerializedName("ContentPageFindInDefaultSiteCategory")
    public Boolean ContentPageFindInDefaultSiteCategory;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;
}
