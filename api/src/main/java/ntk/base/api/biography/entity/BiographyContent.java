package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class BiographyContent extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("ModuleCoreCreatedBy")
    public String ModuleCoreCreatedBy;

    @SerializedName("ModuleCoreUpdatedBy")
    public String ModuleCoreUpdatedBy;

    @SerializedName("Source")
    public String Source;

    @SerializedName("Comments")
    public List<BiographyComment> Comments;

    @SerializedName("virtual_Category")
    public BiographyCategory virtual_Category;

    @SerializedName("Category")
    public BiographyCategory Category;

    @SerializedName("ContentTags")
    public List<BiographyContentTag> ContentTags;

    @SerializedName("Similars")
    public List<BiographyContentSimilar> Similars;

    @SerializedName("OtherInfos")
    public List<BiographyContentOtherInfo> OtherInfos;

    @SerializedName("ContentAndParameterValues")
    public List<BiographyContentAndParameterValue> ContentAndParameterValues;

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

    @SerializedName("LinkFilePodcastId")
    public Long LinkFilePodcastId;

    @SerializedName("LinkFileMovieId")
    public long LinkFileMovieId;

    @SerializedName("LinkMainImageId")
    public long LinkMainImageId;

    @SerializedName("ScoreClick")
    public int ScoreClick;

    @SerializedName("ScoreSumPercent")
    public int ScoreSumPercent;

    @SerializedName("Title")
    public String Title;

    @SerializedName("ViewCount")
    public int ViewCount;

    @SerializedName("Favorited")
    public Boolean Favorited;

    @SerializedName("MainImageSrc")
    public List<String> MainImageSrc;

    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;

    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}