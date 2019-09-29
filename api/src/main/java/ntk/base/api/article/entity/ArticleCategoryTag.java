package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ArticleCategoryTag extends BaseModuleEntity {

    @SerializedName("Description")
    public String Description;

    @SerializedName("FontIcon")
    public String FontIcon;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Children")
    public List<ArticleCategoryTag> Children;

    @SerializedName("CategoryTag")
    public ArticleCategoryTag CategoryTag;

    @SerializedName("virtual_CategoryTag")
    public ArticleCategoryTag virtual_CategoryTag;

    @SerializedName("Tags")
    public List<ArticleTag> Tags;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;
}