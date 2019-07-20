package ntk.base.api.ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.ticketing.entity.TicketingAnswer;

public class TicketingAnswerResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingAnswer> ListItems;

    @SerializedName("Item")
    public TicketingAnswer Item;
}
