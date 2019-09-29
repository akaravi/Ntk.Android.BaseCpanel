package ntk.base.api.ticketing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.ticketing.entity.TicketingDepartemen;

public class TicketingDepartemenResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingDepartemen> ListItems;

    @SerializedName("Item")
    public TicketingDepartemen Item;
}
