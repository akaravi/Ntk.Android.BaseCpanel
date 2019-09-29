package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ArticleTag extends BaseModuleEntity {

    @SerializedName("LinkCategoryTagId")
    public Long LinkCategoryTagId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("CategoryTag")
    public ArticleCategoryTag CategoryTag;

    @SerializedName("ContentTags")
    public List<ArticleContentTag> ContentTags;
}