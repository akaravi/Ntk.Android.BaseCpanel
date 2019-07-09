package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseCoreEntity;

public class CoreAllMenuResponse extends BaseCoreEntity {

    @SerializedName("ListItems")
    public List<CoreAllMenu> ListItems;

    @SerializedName("Item")
    public CoreAllMenu Item;
}
