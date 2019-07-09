package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseCoreEntity;

class CoreAllMenu extends BaseCoreEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleML")
    public String TitleML;

    @SerializedName("Description")
    public String Description;

    @SerializedName("ShowInMenu")
    public String ShowInMenu;

    @SerializedName("ShowInMenuOrder")
    public String ShowInMenuOrder;

    @SerializedName("ShowInAccessAdminAllowToProfessionalData")
    public String ShowInAccessAdminAllowToProfessionalData;

    @SerializedName("virtual_Parent")
    public String virtual_Parent;

    @SerializedName("Parent")
    public String Parent;

    @SerializedName("Children")
    public String Children;

    @SerializedName("Id")
    public Long Id;

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

    @SerializedName("MenuPlaceType")
    public int MenuPlaceType;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

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
