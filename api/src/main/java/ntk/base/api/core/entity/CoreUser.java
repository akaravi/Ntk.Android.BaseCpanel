package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseCoreEntity;

public class CoreUser extends BaseCoreEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Username")
    public String Username;

    @SerializedName("Gender")
    public int Gender;

    @SerializedName("Email")
    public String Email;

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("EmailConfirmed")
    public Boolean EmailConfirmed;

    @SerializedName("MobileConfirmed")
    public Boolean MobileConfirmed;

    @SerializedName("Pwd")
    public String Pwd;

    @SerializedName("ExpireLockAccount")
    public String ExpireLockAccount;

    @SerializedName("Name")
    public String Name;

    @SerializedName("LastName")
    public String LastName;

    @SerializedName("FullName")
    public String FullName;

    @SerializedName("Address")
    public String Address;

    @SerializedName("Tell")
    public String Tell;

    @SerializedName("NationalCode")
    public String NationalCode;

    @SerializedName("IsCompany")
    public Boolean IsCompany;

    @SerializedName("LinkLocationId")
    public Long LinkLocationId;

    @SerializedName("PostalCode")
    public String PostalCode;

    @SerializedName("FirewallAllowIP")
    public String FirewallAllowIP;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("SiteUsers")
    public List<CoreSiteUser> SiteUsers;
}