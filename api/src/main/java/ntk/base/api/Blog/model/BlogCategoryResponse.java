package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogCategory;
import ntk.base.api.model.ErrorException;

public class BlogCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogCategory> ListItems;

    @SerializedName("Item")
    public BlogCategory Item;
}
