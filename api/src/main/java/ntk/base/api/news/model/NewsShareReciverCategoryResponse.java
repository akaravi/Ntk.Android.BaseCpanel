package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.news.entity.NewsShareReciverCategory;

public class NewsShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsShareReciverCategory> ListItems;

    @SerializedName("Item")
    public NewsShareReciverCategory Item;
}
