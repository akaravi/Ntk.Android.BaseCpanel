package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleContentAndParameterValue;
import ntk.base.api.baseModel.ErrorException;

public class ArticleContentAndParameterValueResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentAndParameterValue> ListItems;

    @SerializedName("Item")
    public ArticleContentAndParameterValue Item;
}
