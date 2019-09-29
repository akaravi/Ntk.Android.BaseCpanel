package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ArticleContent extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("ModuleCoreCreatedBy")
    public String ModuleCoreCreatedBy;

    @SerializedName("ModuleCoreUpdatedBy")
    public String ModuleCoreUpdatedBy;

    @SerializedName("Source")
    public String Source;

    @SerializedName("Comments")
    public List<ArticleComment> Comments;

    @SerializedName("virtual_Category")
    public ArticleCategory virtual_Category;

    @SerializedName("Category")
    public ArticleCategory Category;

    @SerializedName("ContentTags")
    public List<ArticleContentTag> ContentTags;

    @SerializedName("Similars")
    public List<ArticleContentSimilar> Similars;

    @SerializedName("OtherInfos")
    public List<ArticleContentOtherInfo> OtherInfos;

    @SerializedName("ContentAndParameterValues")
    public List<ArticleContentAndParameterValue> ContentAndParameterValues;

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