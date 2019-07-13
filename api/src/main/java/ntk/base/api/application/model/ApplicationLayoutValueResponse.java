package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.application.entity.ApplicationLayoutValue;
import ntk.base.api.model.ErrorException;

public class ApplicationLayoutValueResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ApplicationLayoutValue> ListItems;

    @SerializedName("Item")
    public ApplicationLayoutValue Item;
}
