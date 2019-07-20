package ntk.base.api.ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.ticketing.entity.TicketingDepartemenOperator;

public class TicketingDepartemenOperatorResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingDepartemenOperator> ListItems;

    @SerializedName("Item")
    public TicketingDepartemenOperator Item;
}
