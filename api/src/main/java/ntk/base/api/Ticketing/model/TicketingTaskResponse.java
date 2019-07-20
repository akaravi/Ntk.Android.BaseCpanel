package ntk.base.api.Ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Ticketing.entity.TicketingTask;
import ntk.base.api.model.ErrorException;

public class TicketingTaskResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingTask> ListItems;

    @SerializedName("Item")
    public TicketingTask Item;
}
