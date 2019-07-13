package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ApplicationSource extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("DefaultAppId")
    public Long DefaultAppId;

    @SerializedName("ClassName")
    public String ClassName;

    @SerializedName("PackageName")
    public String PackageName;

    @SerializedName("ForceUpdate")
    public Boolean ForceUpdate;

    @SerializedName("LinkLastSuccessfullyBuildFileId")
    public Long LinkLastSuccessfullyBuildFileId;

    @SerializedName("LastSuccessfullyBuildDate")
    public String LastSuccessfullyBuildDate;

    @SerializedName("LastBuildCommandDate")
    public String LastBuildCommandDate;

    @SerializedName("LastBuildCommandBy")
    public String LastBuildCommandBy;

    @SerializedName("LastUnsuccessfullyBuildErrorDate")
    public String LastUnsuccessfullyBuildErrorDate;

    @SerializedName("LastUnsuccessfullyBuildErrorMessage")
    public String LastUnsuccessfullyBuildErrorMessage;

    @SerializedName("Layouts")
    public ApplicationLayout Layouts;

    @SerializedName("Applications")
    public ApplicationApp Applications;

    @SerializedName("FireBaseServerKey")
    public String FireBaseServerKey;

    @SerializedName("DefaultConfigBuilderAdminJsonValues")
    public String DefaultConfigBuilderAdminJsonValues;

    @SerializedName("DefaultConfigRuntimeAdminJsonValues")
    public String DefaultConfigRuntimeAdminJsonValues;

    @SerializedName("DefaultConfigBuilderSiteJsonValues")
    public String DefaultConfigBuilderSiteJsonValues;

    @SerializedName("DefaultConfigRuntimeSiteJsonValues")
    public String DefaultConfigRuntimeSiteJsonValues;

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

    @SerializedName("IsPublish")
    public Boolean IsPublish;

    @SerializedName("SourceNameGit")
    public String SourceNameGit;

    @SerializedName("UpdateSourceByGit")
    public Boolean UpdateSourceByGit;

    @SerializedName("FilePathOnServer")
    public String FilePathOnServer;
}