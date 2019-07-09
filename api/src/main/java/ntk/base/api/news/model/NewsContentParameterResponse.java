package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.news.entity.NewsContentParameter;

public class NewsContentParameterResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContentParameter> ListItems;

    @SerializedName("Item")
    public NewsContentParameter Item;
}
