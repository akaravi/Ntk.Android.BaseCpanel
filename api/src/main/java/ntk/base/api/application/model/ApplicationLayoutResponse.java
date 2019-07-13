package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.application.entity.ApplicationLayout;
import ntk.base.api.model.ErrorException;

public class ApplicationLayoutResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ApplicationLayout> ListItems;

    @SerializedName("Item")
    public ApplicationLayout Item;
}
