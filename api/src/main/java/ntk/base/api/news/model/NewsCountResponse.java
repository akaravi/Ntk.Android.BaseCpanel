package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class NewsCountResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsCount> ListItems;

    @SerializedName("Item")
    public NewsCount Item;
}
