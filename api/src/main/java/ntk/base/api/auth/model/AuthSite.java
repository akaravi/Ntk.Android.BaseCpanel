package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

class AuthSite {

    @SerializedName("LinkCreatedBySiteId")
    public Long LinkCreatedBySiteId;

    @SerializedName("ParentCreator")
    public Long ParentCreator;

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Title")
    public String Title;

    @SerializedName("OwnerSiteSetStatus")
    public int OwnerSiteSetStatus;

    @SerializedName("UserLanguage")
    public int UserLanguage;

    @SerializedName("SubDomain")
    public String SubDomain;

    @SerializedName("Domain")
    public String Domain;

    @SerializedName("Description")
    public String Description;

    @SerializedName("HasAccountingForm")
    public Boolean HasAccountingForm;

    @SerializedName("ViewInCmsSiteLIst")
    public Boolean ViewInCmsSiteLIst;

    @SerializedName("CreatedDate")
    public String CreatedDate;

    @SerializedName("UpdatedDate")
    public String UpdatedDate;
}
