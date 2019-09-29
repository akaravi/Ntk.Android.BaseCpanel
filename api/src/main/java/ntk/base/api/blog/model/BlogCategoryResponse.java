package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogCategory;
import ntk.base.api.baseModel.ErrorException;

public class BlogCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogCategory> ListItems;

    @SerializedName("Item")
    public BlogCategory Item;
}
