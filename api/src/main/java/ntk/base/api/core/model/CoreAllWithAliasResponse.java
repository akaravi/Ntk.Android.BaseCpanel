package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class CoreAllWithAliasResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreAllWithAlias> ListItems;

    @SerializedName("Item")
    public CoreAllWithAlias Item;
}
