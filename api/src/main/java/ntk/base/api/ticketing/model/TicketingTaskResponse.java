package ntk.base.api.ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.ticketing.entity.TicketingTask;

public class TicketingTaskResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingTask> ListItems;

    @SerializedName("Item")
    public TicketingTask Item;
}
