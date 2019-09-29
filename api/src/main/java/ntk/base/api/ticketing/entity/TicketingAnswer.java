package ntk.base.api.ticketing.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class TicketingAnswer extends BaseModuleEntity {

    @SerializedName("LinkTicketId")
    public Long LinkTicketId;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("virtual_Ticket")
    public TicketingTask virtual_Ticket;

    @SerializedName("Ticket")
    public TicketingTask Ticket;

    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;

    @SerializedName("virtual_Departemen")
    public TicketingDepartemen virtual_Departemen;

    @SerializedName("Departemen")
    public TicketingDepartemen Departemen;

    @SerializedName("LinkTypeOperatorId")
    public Long LinkTypeOperatorId;

    @SerializedName("virtual_DepartemenOperator")
    public TicketingDepartemenOperator virtual_DepartemenOperator;

    @SerializedName("DepartemenOperator")
    public TicketingDepartemenOperator DepartemenOperator;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}