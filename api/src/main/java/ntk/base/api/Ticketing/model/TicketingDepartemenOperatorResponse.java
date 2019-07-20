package ntk.base.api.Ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Ticketing.entity.TicketingDepartemenOperator;
import ntk.base.api.model.ErrorException;

public class TicketingDepartemenOperatorResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingDepartemenOperator> ListItems;

    @SerializedName("Item")
    public TicketingDepartemenOperator Item;
}
