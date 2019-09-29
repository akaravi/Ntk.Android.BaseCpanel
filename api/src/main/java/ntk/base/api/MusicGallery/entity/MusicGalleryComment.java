package ntk.base.api.MusicGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class MusicGalleryComment extends BaseModuleEntity {

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

    @SerializedName("virtual_MusicGalleryContent")
    public MusicGalleryContent virtual_MusicGalleryContent;

    @SerializedName("MusicGalleryContent")
    public MusicGalleryContent MusicGalleryContent;
}