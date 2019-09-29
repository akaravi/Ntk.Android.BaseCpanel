package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class BiographyCategoryTag extends BaseModuleEntity {

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
    public List<BiographyCategoryTag> Children;

    @SerializedName("CategoryTag")
    public BiographyCategoryTag CategoryTag;

    @SerializedName("virtual_CategoryTag")
    public BiographyCategoryTag virtual_CategoryTag;

    @SerializedName("Tags")
    public List<BiographyTag> Tags;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;
}