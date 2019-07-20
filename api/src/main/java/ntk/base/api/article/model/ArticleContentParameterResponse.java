package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleContentParameter;
import ntk.base.api.model.ErrorException;

public class ArticleContentParameterResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentParameter> ListItems;

    @SerializedName("Item")
    public ArticleContentParameter Item;
}
