package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseEntity;
import ntk.base.api.model.ErrorException;

public class TicketingCountResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingCount> ListItems;

    @SerializedName("Item")
    public TicketingCount Item;
}
