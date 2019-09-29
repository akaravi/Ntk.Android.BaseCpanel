package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogShareReciverCategory;
import ntk.base.api.baseModel.ErrorException;

public class BlogShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogShareReciverCategory> ListItems;

    @SerializedName("Item")
    public BlogShareReciverCategory Item;
}
