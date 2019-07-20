package ntk.base.api.ticketing.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class TicketingDepartemenOperator extends BaseModuleEntity {

    @SerializedName("LinkDepartemenId")
    public Long LinkDepartemenId;

    @SerializedName("LinkUserId")
    public Long LinkUserId;

    @SerializedName("virtual_Departemen")
    public TicketingDepartemen virtual_Departemen;

    @SerializedName("Departemen")
    public TicketingDepartemen Departemen;

    @SerializedName("Answers")
    public List<TicketingAnswer> Answers;
}