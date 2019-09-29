package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogContentParameterType;
import ntk.base.api.baseModel.ErrorException;

public class BlogContentParameterTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentParameterType> ListItems;

    @SerializedName("Item")
    public BlogContentParameterType Item;
}
