package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.news.entity.NewsContentParameterType;

public class NewsContentParameterTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContentParameterType> ListItems;

    @SerializedName("Item")
    public NewsContentParameterType Item;
}
