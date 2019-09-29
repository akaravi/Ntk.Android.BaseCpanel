package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CorePage;
import ntk.base.api.baseModel.ErrorException;

public class CorePageResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CorePage> ListItems;

    @SerializedName("Item")
    public CorePage Item;
}
