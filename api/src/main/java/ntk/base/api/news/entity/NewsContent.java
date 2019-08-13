package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class NewsContent extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

//    @SerializedName("ModuleCoreCreatedBy")
//    public String ModuleCoreCreatedBy;
//
//    @SerializedName("ModuleCoreUpdatedBy")
//    public String ModuleCoreUpdatedBy;

    @SerializedName("Source")
    public String Source;

//    @SerializedName("Comments")
//    public String Comments;
//
//    @SerializedName("virtual_Category")
//    public NewsCategory virtual_Category;

    @SerializedName("Category")
    public NewsCategory Category;

    @SerializedName("ContentTags")
    public NewsContentTag ContentTags;

//    @SerializedName("Similars")
//    public NewsContentSimilar Similars;
//
//    @SerializedName("OtherInfos")
//    public NewsContentOtherInfo OtherInfos;
//
//    @SerializedName("ContentAndParameterValues")
//    public String ContentAndParameterValues;

    @SerializedName("Body")
    public String Body;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FromDate")
    public String FromDate;

    @SerializedName("Geolocationlatitude")
    public String Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public String Geolocationlongitude;

    @SerializedName("Keyword")
    public String Keyword;

    @SerializedName("LinkCategoryId")
    public String LinkCategoryId;

//    @SerializedName("LinkFileIds")
//    public String LinkFileIds;
//
//    @SerializedName("LinkFilePodcastId")
//    public String LinkFilePodcastId;
//
//    @SerializedName("LinkFileMovieId")
//    public String LinkFileMovieId;
//
//    @SerializedName("LinkMainImageId")
//    public String LinkMainImageId;

    @SerializedName("ScoreClick")
    public String ScoreClick;

    @SerializedName("ScoreSumPercent")
    public String ScoreSumPercent;

    @SerializedName("Title")
    public String Title;

    @SerializedName("ViewCount")
    public String ViewCount;

//    @SerializedName("Favorited")
//    public String Favorited;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;
//
//    @SerializedName("LinkFilePodcastIdSrc")
//    public String LinkFilePodcastIdSrc;
//
//    @SerializedName("LinkFileMovieIdSrc")
//    public String LinkFileMovieIdSrc;
//
//    @SerializedName("LinkFileIdsSrc")
//    public String LinkFileIdsSrc;
}
