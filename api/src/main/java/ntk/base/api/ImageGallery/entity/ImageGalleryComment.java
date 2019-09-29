package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ImageGalleryComment extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public long LinkContentId;

    @SerializedName("LinkParentId")
    public long LinkParentId;

    @SerializedName("Writer")
    public String Writer;

    @SerializedName("Comment")
    public String Comment;

    @SerializedName("RegisterDate")
    public String RegisterDate;

    @SerializedName("SumLikeClick")
    public int SumLikeClick;

    @SerializedName("SumDisLikeClick")
    public int SumDisLikeClick;

    @SerializedName("virtual_ImageGalleryContent")
    public ImageGalleryContent virtual_ImageGalleryContent;

    @SerializedName("ImageGalleryContent")
    public ImageGalleryContent ImageGalleryContent;
}