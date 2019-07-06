package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseEntity;

class TicketingCount extends BaseEntity {

    @SerializedName("Answers")
    public String Answers;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;

    @SerializedName("AntiInjectionExpiredMinute")
    public Long AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("CreateAntiInjectionValue")
    public Boolean CreateAntiInjectionValue;

    @SerializedName("Departemen")
    public String Departemen;

    @SerializedName("DeviceInformation")
    public String DeviceInformation;

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Id")
    public Long Id;

    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;

    @SerializedName("LinkMemberUserId")
    public String LinkMemberUserId;

    @SerializedName("LinkOperatorId")
    public String LinkOperatorId;

    @SerializedName("LinkSiteId")
    public String LinkSiteId;

    @SerializedName("TicketingDepartemenDefaultAnswerBody")
    public String TicketingDepartemenDefaultAnswerBody;

    @SerializedName("Title")
    public String Title;

    @SerializedName("TokenActionState")
    public String TokenActionState;

    @SerializedName("UserIpAddress")
    public String UserIpAddress;

    @SerializedName("virtual_Departemen")
    public String virtual_Departemen;
}
