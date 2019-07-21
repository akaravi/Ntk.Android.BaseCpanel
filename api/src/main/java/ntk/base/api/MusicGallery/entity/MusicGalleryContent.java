package ntk.base.api.MusicGallery.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class MusicGalleryContent extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("ModuleCoreCreatedBy")
    public String ModuleCoreCreatedBy;

    @SerializedName("ModuleCoreUpdatedBy")
    public String ModuleCoreUpdatedBy;

    @SerializedName("Source")
    public String Source;

    @SerializedName("Comments")
    public List<MusicGalleryComment> Comments;

    @SerializedName("virtual_Category")
    public MusicGalleryCategory virtual_Category;

    @SerializedName("Category")
    public MusicGalleryCategory Category;

    @SerializedName("ContentTags")
    public List<MusicGalleryContentTag> ContentTags;

    @SerializedName("Similars")
    public MusicGalleryContentSimilar Similars;

    @SerializedName("OtherInfos")
    public List<MusicGalleryContentOtherInfo> OtherInfos;

    @SerializedName("ContentAndParameterValues")
    public List<MusicGalleryContentAndParameterValue> ContentAndParameterValues;

    @SerializedName("Body")
    public String Body;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FromDate")
    public String FromDate;

    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;

    @SerializedName("Keyword")
    public String Keyword;

    @SerializedName("LinkCategoryId")
    public Long LinkCategoryId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkMainMusicId")
    public Long LinkMainMusicId;

    @SerializedName("LinkFilePodcastId")
    public Long LinkFilePodcastId;

    @SerializedName("ScoreClick")
    public int ScoreClick;

    @SerializedName("ScoreSumPercent")
    public int ScoreSumPercent;

    @SerializedName("Title")
    public String Title;

    @SerializedName("ViewCount")
    public int ViewCount;

    @SerializedName("LinkFileId")
    public Long LinkFileId;

    @SerializedName("LinkFolderIds")
    public String LinkFolderIds;

    @SerializedName("Favorited")
    public Boolean Favorited;

    @SerializedName("MainMusicSrc")
    public String MainMusicSrc;

    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}