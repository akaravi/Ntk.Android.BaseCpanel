package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogContentSimilar;
import ntk.base.api.baseModel.ErrorException;

public class BlogContentSimilarResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentSimilar> ListItems;

    @SerializedName("Item")
    public BlogContentSimilar Item;
}
