package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class ImageGalleryContent extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("ModuleCoreCreatedBy")
    public String ModuleCoreCreatedBy;

    @SerializedName("ModuleCoreUpdatedBy")
    public String ModuleCoreUpdatedBy;

    @SerializedName("Source")
    public String Source;

    @SerializedName("Comments")
    public List<ImageGalleryComment> Comments;

    @SerializedName("virtual_Category")
    public ImageGalleryCategory virtual_Category;

    @SerializedName("Category")
    public ImageGalleryCategory Category;

    @SerializedName("ContentTags")
    public List<ImageGalleryContentTag> ContentTags;

    @SerializedName("Similars")
    public ImageGalleryContentSimilar Similars;

    @SerializedName("OtherInfos")
    public List<ImageGalleryContentOtherInfo> OtherInfos;

    @SerializedName("ContentAndParameterValues")
    public List<ImageGalleryContentAndParameterValue> ContentAndParameterValues;

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

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

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

    @SerializedName("MainImageSrc")
    public String MainImageSrc;

    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}