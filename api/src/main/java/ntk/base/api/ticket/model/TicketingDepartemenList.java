package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class TicketingDepartemenList extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingDepartemen> ListItems;

    @SerializedName("Item")
    public TicketingDepartemen Item;
}
