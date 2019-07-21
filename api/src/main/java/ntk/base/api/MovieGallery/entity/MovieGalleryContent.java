package ntk.base.api.MovieGallery.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class MovieGalleryContent extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("ModuleCoreCreatedBy")
    public String ModuleCoreCreatedBy;

    @SerializedName("ModuleCoreUpdatedBy")
    public String ModuleCoreUpdatedBy;

    @SerializedName("Source")
    public String Source;

    @SerializedName("Comments")
    public List<MovieGalleryComment> Comments;

    @SerializedName("virtual_Category")
    public MovieGalleryCategory virtual_Category;

    @SerializedName("Category")
    public MovieGalleryCategory Category;

    @SerializedName("ContentTags")
    public List<MovieGalleryContentTag> ContentTags;

    @SerializedName("Similars")
    public MovieGalleryContentSimilar Similars;

    @SerializedName("OtherInfos")
    public List<MovieGalleryContentOtherInfo> OtherInfos;

    @SerializedName("ContentAndParameterValues")
    public List<MovieGalleryContentAndParameterValue> ContentAndParameterValues;

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

    @SerializedName("LinkMainMovieId")
    public Long LinkMainMovieId;

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

    @SerializedName("MainMovieSrc")
    public String MainMovieSrc;

    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}