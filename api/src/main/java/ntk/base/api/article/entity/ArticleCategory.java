package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class ArticleCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public ArticleCategory Category;

    @SerializedName("virtual_Category")
    public ArticleCategory virtual_Category;

    @SerializedName("ShareServerCategories")
    public List<ArticleShareServerCategory> ShareServerCategories;

    @SerializedName("ShareReciverCategories")
    public List<ArticleShareReciverCategory> ShareReciverCategories;

    @SerializedName("Children")
    public List<ArticleCategory> Children;

    @SerializedName("Contents")
    public List<ArticleContent> Contents;

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

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;
}