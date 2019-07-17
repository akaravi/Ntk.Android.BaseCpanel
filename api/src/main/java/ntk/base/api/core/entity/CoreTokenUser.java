package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class CoreTokenUser extends BaseModuleEntity {

    @SerializedName("LinkUserId")
    public Long LinkUserId;

    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;

    @SerializedName("DeviceId")
    public String DeviceId;

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("UserAccessAreaType")
    public int UserAccessAreaType;

    @SerializedName("UserType")
    public int UserType;

    @SerializedName("RememberOnDivice")
    public Boolean RememberOnDivice;

    @SerializedName("UserLanguage")
    public String UserLanguage;

    @SerializedName("TicketDate")
    public String TicketDate;

    @SerializedName("CurrentSiteDomainUrl")
    public String CurrentSiteDomainUrl;

    @SerializedName("BrowserLanguage")
    public String BrowserLanguage;

    @SerializedName("UserAccessAdminAllowToAllData")
    public Boolean UserAccessAdminAllowToAllData;

    @SerializedName("UserAccessAdminAllowToProfessionalData")
    public Boolean UserAccessAdminAllowToProfessionalData;

    @SerializedName("UserTypeValue")
    public String UserTypeValue;
}