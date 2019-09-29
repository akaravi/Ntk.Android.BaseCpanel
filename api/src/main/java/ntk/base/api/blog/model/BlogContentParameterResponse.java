package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogContentParameter;
import ntk.base.api.baseModel.ErrorException;

public class BlogContentParameterResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentParameter> ListItems;

    @SerializedName("Item")
    public BlogContentParameter Item;
}
