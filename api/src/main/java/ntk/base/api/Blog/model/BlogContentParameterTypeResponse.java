package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogContentParameterType;
import ntk.base.api.model.ErrorException;

public class BlogContentParameterTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentParameterType> ListItems;

    @SerializedName("Item")
    public BlogContentParameterType Item;
}
