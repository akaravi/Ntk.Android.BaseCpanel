package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class BiographyCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public BiographyCategory Category;

    @SerializedName("virtual_Category")
    public BiographyCategory virtual_Category;

    @SerializedName("ShareServerCategories")
    public List<BiographyShareServerCategory> ShareServerCategories;

    @SerializedName("ShareReciverCategories")
    public List<BiographyShareReciverCategory> ShareReciverCategories;

    @SerializedName("Children")
    public List<BiographyCategory> Children;

    @SerializedName("Contents")
    public List<BiographyContent> Contents;

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