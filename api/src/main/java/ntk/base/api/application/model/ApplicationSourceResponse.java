package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.application.entity.ApplicationSource;
import ntk.base.api.baseModel.ErrorException;

public class ApplicationSourceResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ApplicationSource> ListItems;

    @SerializedName("Item")
    public ApplicationSource Item;
}
