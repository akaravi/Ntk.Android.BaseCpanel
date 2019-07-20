package ntk.base.api.Ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Ticketing.entity.TicketingDepartemen;
import ntk.base.api.model.ErrorException;

public class TicketingDepartemenResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingDepartemen> ListItems;

    @SerializedName("Item")
    public TicketingDepartemen Item;
}
