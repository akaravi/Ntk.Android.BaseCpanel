package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

class ImageGalleryContentOtherInfo extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Source")
    public String Source;

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("TypeId")
    public int TypeId;

    @SerializedName("virtual_ImageGalleryContent")
    public ImageGalleryContent virtual_ImageGalleryContent;

    @SerializedName("ImageGalleryContent")
    public ImageGalleryContent ImageGalleryContent;
}