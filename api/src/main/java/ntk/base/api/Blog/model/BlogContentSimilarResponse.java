package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogContentSimilar;
import ntk.base.api.model.ErrorException;

public class BlogContentSimilarResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentSimilar> ListItems;

    @SerializedName("Item")
    public BlogContentSimilar Item;
}
