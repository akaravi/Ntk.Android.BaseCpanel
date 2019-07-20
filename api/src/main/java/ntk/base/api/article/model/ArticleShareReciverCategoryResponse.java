package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleShareReciverCategory;
import ntk.base.api.model.ErrorException;

public class ArticleShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleShareReciverCategory> ListItems;

    @SerializedName("Item")
    public ArticleShareReciverCategory Item;
}
