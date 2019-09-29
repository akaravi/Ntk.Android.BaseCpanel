package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogShareServerCategory;
import ntk.base.api.baseModel.ErrorException;

public class BlogShareServerCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogShareServerCategory> ListItems;

    @SerializedName("Item")
    public BlogShareServerCategory Item;
}
