package ntk.base.api.Ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Ticketing.entity.TicketingFaq;
import ntk.base.api.model.ErrorException;

public class TicketingFaqResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingFaq> ListItems;

    @SerializedName("Item")
    public TicketingFaq Item;
}
