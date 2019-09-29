package ntk.base.api.ticketing.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class TicketingFaq extends BaseModuleEntity {

    @SerializedName("Question")
    public String Question;

    @SerializedName("Answer")
    public String Answer;

    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;

    @SerializedName("virtual_TicketingDepartemen")
    public TicketingDepartemen virtual_TicketingDepartemen;

    @SerializedName("TicketingDepartemen")
    public TicketingDepartemen TicketingDepartemen;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;
}
