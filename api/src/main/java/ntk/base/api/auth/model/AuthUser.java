package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

class AuthUser extends BaseEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Username")
    public String Username;

    @SerializedName("Email")
    public String Email;

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("EmailConfirmed")
    public Boolean EmailConfirmed;

    @SerializedName("MobileConfirmed")
    public Boolean MobileConfirmed;

    @SerializedName("ExpireLockAccount")
    public String ExpireLockAccount;

    @SerializedName("Pwd")
    public String Pwd;

    @SerializedName("Name")
    public String Name;

    @SerializedName("LastName")
    public String LastName;

    @SerializedName("Gender")
    public int Gender;

    @SerializedName("FullName")
    public String FullName;

    @SerializedName("Address")
    public String Address;

    @SerializedName("IsCompany")
    public Boolean IsCompany;

    @SerializedName("Tell")
    public String Tell;

    @SerializedName("NationalCode")
    public String NationalCode;

    @SerializedName("LinkLocationId")
    public String LinkLocationId;

    @SerializedName("PostalCode")
    public String PostalCode;

    @SerializedName("FirewallAllowIP")
    public String FirewallAllowIP;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("SiteUsers")
    public String SiteUsers;

    @SerializedName("Id")
    public Long Id;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("CreateAntiInjectionValue")
    public String CreateAntiInjectionValue;

    @SerializedName("TokenActionState")
    public int TokenActionState;

    @SerializedName("AntiInjectionExpiredMinute")
    public Long AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;
}
