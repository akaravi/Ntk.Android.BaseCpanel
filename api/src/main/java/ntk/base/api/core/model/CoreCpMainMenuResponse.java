package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreCpMainMenu;
import ntk.base.api.baseModel.ErrorException;

public class CoreCpMainMenuResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreCpMainMenu> ListItems;

    @SerializedName("Item")
    public CoreCpMainMenu Item;
}
