package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ImageGalleryCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public ImageGalleryCategory Category;

    @SerializedName("virtual_Category")
    public ImageGalleryCategory virtual_Category;

    @SerializedName("ShareServerCategories")
    public List<ImageGalleryShareServerCategory> ShareServerCategories;

    @SerializedName("ShareReciverCategories")
    public List<ImageGalleryShareReciverCategory> ShareReciverCategories;

    @SerializedName("Children")
    public List<ImageGalleryCategory> Children;

    @SerializedName("Contents")
    public List<ImageGalleryContent> Contents;

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