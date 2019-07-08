package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.news.entity.NewsContentTag;

public class NewsContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContentTag> ListItems;

    @SerializedName("Item")
    public NewsContentTag Item;
}
