package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class BiographyTag extends BaseModuleEntity {

    @SerializedName("LinkCategoryTagId")
    public Long LinkCategoryTagId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("CategoryTag")
    public BiographyCategoryTag CategoryTag;

    @SerializedName("ContentTags")
    public List<BiographyContentTag> ContentTags;
}