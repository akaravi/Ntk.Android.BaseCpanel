package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.news.entity.NewsShareServerCategory;

public class NewsShareServerCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsShareServerCategory> ListItems;

    @SerializedName("Item")
    public NewsShareServerCategory Item;
}
