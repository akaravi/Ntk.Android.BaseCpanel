package ntk.base.api.blog.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class BlogTag extends BaseModuleEntity {

    @SerializedName("LinkCategoryTagId")
    public Long LinkCategoryTagId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("CategoryTag")
    public BlogCategoryTag CategoryTag;

    @SerializedName("ContentTags")
    public List<BlogContentTag> ContentTags;
}