package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ApplicationApp extends BaseModuleEntity {

    @SerializedName("AppKey")
    public String AppKey;

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("LinkFileIdIcon")
    public Long LinkFileIdIcon;

    @SerializedName("LinkFileIdLogo")
    public Long LinkFileIdLogo;

    @SerializedName("LinkFileIdSplashScreen")
    public Long LinkFileIdSplashScreen;

    @SerializedName("Title")
    public String Title;

    @SerializedName("AppVersion")
    public Long AppVersion;

    @SerializedName("IsPublished")
    public Boolean IsPublished;

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("virtual_Source")
    public ApplicationSource virtual_Source;

    @SerializedName("Source")
    public ApplicationSource Source;

    @SerializedName("DownloadCount")
    public Long DownloadCount;

    @SerializedName("IsGlobalUser")
    public Boolean IsGlobalUser;

    @SerializedName("ForceUpdate")
    public Boolean ForceUpdate;

    @SerializedName("QrCode")
    public String QrCode;

    @SerializedName("LastBuildStatus")
    public int LastBuildStatus;

    @SerializedName("LastNotificationOrderDate")
    public String LastNotificationOrderDate;

    @SerializedName("LastBuildOrderDate")
    public String LastBuildOrderDate;

    @SerializedName("LastBuildRunDate")
    public String LastBuildRunDate;

    @SerializedName("LastBuildEndDate")
    public String LastBuildEndDate;

    @SerializedName("LastBuildErrorMessage")
    public String LastBuildErrorMessage;

    @SerializedName("LastSuccessfullyBuildDate")
    public String LastSuccessfullyBuildDate;

    @SerializedName("LayoutValues")
    public ApplicationLayoutValue LayoutValues;

    @SerializedName("BuildCount")
    public String BuildCount;

    @SerializedName("LinkThemeConfigId")
    public Long LinkThemeConfigId;

    @SerializedName("virtual_ThemeConfig")
    public ApplicationThemeConfig virtual_ThemeConfig;

    @SerializedName("ThemeConfig")
    public ApplicationThemeConfig ThemeConfig;

    @SerializedName("ConfigBuilderAdminJsonValues")
    public String ConfigBuilderAdminJsonValues;

    @SerializedName("ConfigRuntimeAdminJsonValues")
    public String ConfigRuntimeAdminJsonValues;

    @SerializedName("ConfigBuilderSiteJsonValues")
    public String ConfigBuilderSiteJsonValues;

    @SerializedName("ConfigRuntimeSiteJsonValues")
    public String ConfigRuntimeSiteJsonValues;

    @SerializedName("ScoreClick")
    public int ScoreClick;

    @SerializedName("ScoreSumPercent")
    public int ScoreSumPercent;

    @SerializedName("AdminConfigFormFormatter")
    public String AdminConfigFormFormatter;

    @SerializedName("UserConfigFormFormatter")
    public String UserConfigFormFormatter;

    @SerializedName("ThemeConfigJsonValues")
    public String ThemeConfigJsonValues;

    @SerializedName("BuildKey1String")
    public String BuildKey1String;

    @SerializedName("BuildKey1Value")
    public String BuildKey1Value;

    @SerializedName("BuildKey2String")
    public String BuildKey2String;

    @SerializedName("BuildKey2Value")
    public String BuildKey2Value;

    @SerializedName("BuildKey3String")
    public String BuildKey3String;

    @SerializedName("BuildKey3Value")
    public String BuildKey3Value;

    @SerializedName("BuildKey4String")
    public String BuildKey4String;

    @SerializedName("BuildKey4Value")
    public String BuildKey4Value;

    @SerializedName("BuildKey5String")
    public String BuildKey5String;

    @SerializedName("BuildKey5Value")
    public String BuildKey5Value;

    @SerializedName("DownloadLinksrc")
    public String DownloadLinksrc;

    @SerializedName("DownloadLinksrcByDomain")
    public String DownloadLinksrcByDomain;

    @SerializedName("FilePathOnServer")
    public String FilePathOnServer;
}
