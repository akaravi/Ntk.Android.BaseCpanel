package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.application.entity.ApplicationThemeConfig;
import ntk.base.api.model.ErrorException;

public class ApplicationThemeConfigResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ApplicationThemeConfig> ListItems;

    @SerializedName("Item")
    public ApplicationThemeConfig Item;
}
