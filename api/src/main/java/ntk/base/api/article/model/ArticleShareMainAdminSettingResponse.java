package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleShareMainAdminSetting;
import ntk.base.api.model.ErrorException;

public class ArticleShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public ArticleShareMainAdminSetting Item;
}
