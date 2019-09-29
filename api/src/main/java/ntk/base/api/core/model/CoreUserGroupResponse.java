package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreUserGroup;
import ntk.base.api.baseModel.ErrorException;

public class CoreUserGroupResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreUserGroup> ListItems;

    @SerializedName("Item")
    public CoreUserGroup Item;
}
