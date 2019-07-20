package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogShareReciverCategory;
import ntk.base.api.model.ErrorException;

public class BlogShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogShareReciverCategory> ListItems;

    @SerializedName("Item")
    public BlogShareReciverCategory Item;
}
