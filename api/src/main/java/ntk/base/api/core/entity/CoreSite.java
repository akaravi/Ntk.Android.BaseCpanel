package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseCoreEntity;

public class CoreSite extends BaseCoreEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("LinkCreatedBySiteId")
    public Long LinkCreatedBySiteId;

    @SerializedName("virtual_ParentCreator")
    public CoreSite virtual_ParentCreator;

    @SerializedName("ParentCreator")
    public CoreSite ParentCreator;

    @SerializedName("Title")
    public String Title;

    @SerializedName("OwnerSiteSetStatus")
    public int OwnerSiteSetStatus;

    @SerializedName("UserLanguage")
    public String UserLanguage;

    @SerializedName("SubDomain")
    public String SubDomain;

    @SerializedName("Domain")
    public String Domain;

    @SerializedName("Redirect")
    public String Redirect;

    @SerializedName("Keyword")
    public String Keyword;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkFavIconId")
    public Long LinkFavIconId;

    @SerializedName("LinkSiteCategoryId")
    public Long LinkSiteCategoryId;

    @SerializedName("virtual_CmsSiteCategory")
    public CoreSiteCategory virtual_CmsSiteCategory;

    @SerializedName("CmsSiteCategory")
    public CoreSiteCategory CmsSiteCategory;

    @SerializedName("HasAccountingForm")
    public Boolean HasAccountingForm;

    @SerializedName("ViewInCmsSiteLIst")
    public Boolean ViewInCmsSiteLIst;

    @SerializedName("AccountingFormNo")
    public Long AccountingFormNo;

    @SerializedName("AccountingFormCreatedDate")
    public List<CoreUser> AccountingFormCreatedDate;

    @SerializedName("AccountingFormUpdatedDate")
    public List<CorePage> AccountingFormUpdatedDate;

    @SerializedName("SiteUsers")
    public String SiteUsers;

    @SerializedName("Pages")
    public String Pages;

    @SerializedName("ModuleSites")
    public List<CoreSite> ModuleSites;

    @SerializedName("SiteMenus")
    public List<CoreSiteMenu> SiteMenus;

    @SerializedName("DomainAliases")
    public List<CoreSiteDomainAlias> DomainAliases;

    @SerializedName("ChildernCreateds")
    public List<CoreSite> ChildernCreateds;

    @SerializedName("CurrentSiteDomainUrl")
    public String CurrentSiteDomainUrl;

    @SerializedName("Copyright")
    public String Copyright;

    @SerializedName("WebMasterEmail")
    public String WebMasterEmail;

    @SerializedName("WebEditorEmail")
    public String WebEditorEmail;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;
}