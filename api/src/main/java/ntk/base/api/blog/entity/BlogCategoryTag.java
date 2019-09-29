package ntk.base.api.blog.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class BlogCategoryTag extends BaseModuleEntity {

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
    public List<BlogCategoryTag> Children;

    @SerializedName("CategoryTag")
    public BlogCategoryTag CategoryTag;

    @SerializedName("virtual_CategoryTag")
    public BlogCategoryTag virtual_CategoryTag;

    @SerializedName("Tags")
    public List<BlogTag> Tags;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;
}