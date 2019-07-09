package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class NewsCategoryTag extends BaseModuleEntity {

    @SerializedName("Children")
    public NewsCategoryTag Children;

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

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;

    @SerializedName("Title")
    public String Title;

    @SerializedName("CategoryTag")
    public NewsCategoryTag CategoryTag;

    @SerializedName("virtual_CategoryTag")
    public NewsCategoryTag virtual_CategoryTag;

    @SerializedName("Tags")
    public NewsTag Tags;
}
