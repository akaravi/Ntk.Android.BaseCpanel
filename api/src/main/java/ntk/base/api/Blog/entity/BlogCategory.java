package ntk.base.api.Blog.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class BlogCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public BlogCategory Category;

    @SerializedName("virtual_Category")
    public BlogCategory virtual_Category;

    @SerializedName("ShareServerCategories")
    public List<BlogShareServerCategory> ShareServerCategories;

    @SerializedName("ShareReciverCategories")
    public List<BlogShareReciverCategory> ShareReciverCategories;

    @SerializedName("Children")
    public List<BlogCategory> Children;

    @SerializedName("Contents")
    public List<BlogContent> Contents;

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