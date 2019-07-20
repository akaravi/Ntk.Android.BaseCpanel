package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ArticleContentOtherInfo extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Source")
    public String Source;

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("TypeId")
    public int TypeId;

    @SerializedName("virtual_ArticleContent")
    public ArticleContent virtual_ArticleContent;

    @SerializedName("ArticleContent")
    public ArticleContent ArticleContent;
}