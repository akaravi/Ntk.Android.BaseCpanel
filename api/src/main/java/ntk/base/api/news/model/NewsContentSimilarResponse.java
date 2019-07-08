package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.news.entity.NewsContentSimilar;

public class NewsContentSimilarResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContentSimilar> ListItems;

    @SerializedName("Item")
    public NewsContentSimilar Item;
}
