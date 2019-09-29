package ntk.base.api.ticketing.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class TicketingTask extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Title")
    public String Title;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;

    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;

    @SerializedName("TicketStatus")
    public int TicketStatus;

    @SerializedName("UserIpAddress")
    public String UserIpAddress;

    @SerializedName("DeviceInformation")
    public String DeviceInformation;

    @SerializedName("virtual_Departemen")
    public TicketingDepartemen virtual_Departemen;

    @SerializedName("Departemen")
    public TicketingDepartemen Departemen;

    @SerializedName("LinkOperatorId")
    public Long LinkOperatorId;

    @SerializedName("Answers")
    public List<TicketingAnswer> Answers;

    @SerializedName("TicketingDepartemenDefaultAnswerBody")
    public String TicketingDepartemenDefaultAnswerBody;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}