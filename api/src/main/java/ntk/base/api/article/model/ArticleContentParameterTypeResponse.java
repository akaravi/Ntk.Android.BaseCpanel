package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleContentParameterType;
import ntk.base.api.model.ErrorException;

public class ArticleContentParameterTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentParameterType> ListItems;

    @SerializedName("Item")
    public ArticleContentParameterType Item;
}
