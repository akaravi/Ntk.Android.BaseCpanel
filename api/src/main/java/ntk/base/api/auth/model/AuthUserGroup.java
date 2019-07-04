package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

class AuthUserGroup {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;

    @SerializedName("Description")
    public String Description;

    @SerializedName("UserType")
    public int UserType;

    @SerializedName("CmsSiteUsers")
    public int CmsSiteUsers;

    @SerializedName("CmsCpMainMenuCmsUserGroup")
    public String CmsCpMainMenuCmsUserGroup;

    @SerializedName("ModuleSaleHeaderGroups")
    public String ModuleSaleHeaderGroups;

    @SerializedName("Id")
    public Long Id;

    @SerializedName("CreatedDate")
    public Boolean CreatedDate;

    @SerializedName("CreatedBy")
    public Boolean CreatedBy;

    @SerializedName("UpdatedDate")
    public String UpdatedDate;

    @SerializedName("UpdatedBy")
    public String UpdatedBy;

    @SerializedName("DataMemoId")
    public Boolean DataMemoId;

    @SerializedName("RecordStatus")
    public Long RecordStatus;
}
