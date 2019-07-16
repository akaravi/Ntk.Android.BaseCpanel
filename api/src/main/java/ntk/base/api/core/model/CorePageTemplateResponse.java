package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CorePageTemplate;
import ntk.base.api.model.ErrorException;

public class CorePageTemplateResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CorePageTemplate> ListItems;

    @SerializedName("Item")
    public CorePageTemplate Item;
}
