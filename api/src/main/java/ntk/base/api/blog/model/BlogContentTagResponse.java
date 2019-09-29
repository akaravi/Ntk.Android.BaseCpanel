package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogContentTag;
import ntk.base.api.baseModel.ErrorException;

public class BlogContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentTag> ListItems;

    @SerializedName("Item")
    public BlogContentTag Item;
}
