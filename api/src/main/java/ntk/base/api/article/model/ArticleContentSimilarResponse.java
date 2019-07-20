package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleContentSimilar;
import ntk.base.api.model.ErrorException;

public class ArticleContentSimilarResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentSimilar> ListItems;

    @SerializedName("Item")
    public ArticleContentSimilar Item;
}
