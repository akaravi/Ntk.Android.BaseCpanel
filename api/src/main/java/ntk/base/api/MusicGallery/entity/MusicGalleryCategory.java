package ntk.base.api.MusicGallery.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class MusicGalleryCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public MusicGalleryCategory Category;

    @SerializedName("virtual_Category")
    public MusicGalleryCategory virtual_Category;

    @SerializedName("ShareServerCategories")
    public List<MusicGalleryShareServerCategory> ShareServerCategories;

    @SerializedName("ShareReciverCategories")
    public List<MusicGalleryShareReciverCategory> ShareReciverCategories;

    @SerializedName("Children")
    public List<MusicGalleryCategory> Children;

    @SerializedName("Contents")
    public List<MusicGalleryContent> Contents;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FontIcon")
    public String FontIcon;

    @SerializedName("LinkMainMusicId")
    public Long LinkMainMusicId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkMainMusicSrc")
    public String LinkMainMusicSrc;
}