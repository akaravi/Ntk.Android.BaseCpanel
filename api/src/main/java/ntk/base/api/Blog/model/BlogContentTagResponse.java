package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogContentTag;
import ntk.base.api.model.ErrorException;

public class BlogContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentTag> ListItems;

    @SerializedName("Item")
    public BlogContentTag Item;
}
