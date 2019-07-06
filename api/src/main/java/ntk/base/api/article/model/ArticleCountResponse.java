package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ArticleCountResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleCount> ListItems;

    @SerializedName("Item")
    public ArticleCount Item;
}
