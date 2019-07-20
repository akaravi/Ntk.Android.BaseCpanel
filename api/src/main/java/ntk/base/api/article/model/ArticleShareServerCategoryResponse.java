package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleShareServerCategory;
import ntk.base.api.model.ErrorException;

public class ArticleShareServerCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleShareServerCategory> ListItems;

    @SerializedName("Item")
    public ArticleShareServerCategory Item;
}
