package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class CoreModule extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleML")
    public String TitleML;

    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;

    @SerializedName("ClassName")
    public String ClassName;

    @SerializedName("Description")
    public String Description;

    @SerializedName("AdministratorIsActivate")
    public Boolean AdministratorIsActivate;

    @SerializedName("ModuleConfigAdminMainJson")
    public String ModuleConfigAdminMainJson;

    @SerializedName("ModuleConfigAdminMainJsonForm")
    public String ModuleConfigAdminMainJsonForm;

    @SerializedName("ModuleConfigSiteAccessDefaultJson")
    public String ModuleConfigSiteAccessDefaultJson;

    @SerializedName("ModuleConfigSiteAccessJsonFrom")
    public String ModuleConfigSiteAccessJsonFrom;

    @SerializedName("ModuleConfigSiteDefaultJson")
    public String ModuleConfigSiteDefaultJson;

    @SerializedName("ModuleConfigSiteJsonForm")
    public String ModuleConfigSiteJsonForm;

    @SerializedName("ModuleSiteStorageValuesJsonForm")
    public String ModuleSiteStorageValuesJsonForm;

    @SerializedName("ModuleSites")
    public List<CoreSite> ModuleSites;

    @SerializedName("CmsModulePageDependency")
    public List<CorePageDependency> CmsModulePageDependency;

    @SerializedName("CmsCpMainMenu")
    public List<CoreCpMainMenu> CmsCpMainMenu;

    @SerializedName("CmsModuleProcess")
    public List<CoreModuleProcess> CmsModuleProcess;

    @SerializedName("CmsSiteCategoryCmsModule")
    public List<CoreSiteCategoryCmsModule> CmsSiteCategoryCmsModule;
}