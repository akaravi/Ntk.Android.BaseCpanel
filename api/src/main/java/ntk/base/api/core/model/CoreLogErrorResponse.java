package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreLogError;
import ntk.base.api.model.ErrorException;

public class CoreLogErrorResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreLogError> ListItems;

    @SerializedName("Item")
    public CoreLogError Item;
}
