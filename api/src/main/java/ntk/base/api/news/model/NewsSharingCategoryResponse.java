package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.entity.NewsSharingCategory;

public class NewsSharingCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsSharingCategory> ListItems;

    @SerializedName("Item")
    public NewsSharingCategory Item;
}
