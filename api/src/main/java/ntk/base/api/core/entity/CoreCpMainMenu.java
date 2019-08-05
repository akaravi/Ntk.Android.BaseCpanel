package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class CoreCpMainMenu extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleML")
    public String TitleML;

    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;

    @SerializedName("Color")
    public String Color;

    @SerializedName("TitleEn")
    public String TitleEn;

    @SerializedName("Icon")
    public String Icon;

    @SerializedName("AddressLink")
    public String AddressLink;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkModuleId")
    public Long LinkModuleId;

    @SerializedName("Description")
    public String Description;

    @SerializedName("ShowInMenu")
    public Boolean ShowInMenu;

    @SerializedName("ShowInMenuOrder")
    public Long ShowInMenuOrder;

    @SerializedName("MenuPlaceType")
    public int MenuPlaceType;

    @SerializedName("ShowInAccessAdminAllowToProfessionalData")
    public Boolean ShowInAccessAdminAllowToProfessionalData;

    @SerializedName("virtual_Parent")
    public CoreCpMainMenu virtual_Parent;

    @SerializedName("Parent")
    public CoreCpMainMenu Parent;

    @SerializedName("virtual_CmsModule")
    public String virtual_CmsModule;

    @SerializedName("CmsModule")
    public CoreModule CmsModule;

    @SerializedName("Children")
    public List<CoreCpMainMenu> Children;

    @SerializedName("CmsCpMainMenuCmsUserGroup")
    public List<CoreUserGroup> CmsCpMainMenuCmsUserGroup;
}