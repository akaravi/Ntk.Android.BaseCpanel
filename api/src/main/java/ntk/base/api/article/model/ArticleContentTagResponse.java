package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleContentTag;
import ntk.base.api.model.ErrorException;

public class ArticleContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentTag> ListItems;

    @SerializedName("Item")
    public ArticleContentTag Item;
}
