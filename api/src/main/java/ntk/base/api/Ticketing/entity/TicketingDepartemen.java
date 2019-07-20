package ntk.base.api.Ticketing.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class TicketingDepartemen extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("DefaultAnswerBody")
    public String DefaultAnswerBody;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("AccessToChangeType")
    public int AccessToChangeType;

    @SerializedName("Tickets")
    public List<TicketingTask> Tickets;

    @SerializedName("TicketAnswers")
    public List<TicketingAnswer> TicketAnswers;

    @SerializedName("Faqs")
    public List<TicketingFaq> Faqs;

    @SerializedName("Operators")
    public List<TicketingDepartemenOperator> Operators;
}