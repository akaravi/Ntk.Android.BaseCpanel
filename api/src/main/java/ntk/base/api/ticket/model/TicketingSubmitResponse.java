package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class TicketingSubmitResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingTask> ListItems;

    @SerializedName("Item")
    public TicketingTask Item;
}
