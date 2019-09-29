package ntk.base.api.ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.ticketing.entity.TicketingFaq;

public class TicketingFaqResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingFaq> ListItems;

    @SerializedName("Item")
    public TicketingFaq Item;
}
