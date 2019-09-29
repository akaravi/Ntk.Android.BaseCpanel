package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.application.entity.ApplicationApp;
import ntk.base.api.baseModel.ErrorException;

public class ApplicationAppResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ApplicationApp> ListItems;

    @SerializedName("Item")
    public ApplicationApp Item;
}
