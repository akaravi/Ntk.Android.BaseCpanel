package ntk.base.api.Ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Ticketing.entity.TicketingAnswer;
import ntk.base.api.model.ErrorException;

public class TicketingAnswerResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingAnswer> ListItems;

    @SerializedName("Item")
    public TicketingAnswer Item;
}
