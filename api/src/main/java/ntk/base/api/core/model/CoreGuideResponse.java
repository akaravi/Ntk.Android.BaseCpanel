package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreGuide;
import ntk.base.api.baseModel.ErrorException;

public class CoreGuideResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreGuide> ListItems;

    @SerializedName("Item")
    public CoreGuide Item;
}
