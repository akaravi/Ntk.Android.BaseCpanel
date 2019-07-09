package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class NewsTag extends BaseModuleEntity {

    @SerializedName("LinkCategoryTagId")
    public Long LinkCategoryTagId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("CategoryTag")
    public NewsCategoryTag CategoryTag;

    @SerializedName("ContentTags")
    public NewsContentTag ContentTags;
}
