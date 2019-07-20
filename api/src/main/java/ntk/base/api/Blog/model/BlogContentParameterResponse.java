package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogContentParameter;
import ntk.base.api.model.ErrorException;

public class BlogContentParameterResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentParameter> ListItems;

    @SerializedName("Item")
    public BlogContentParameter Item;
}
