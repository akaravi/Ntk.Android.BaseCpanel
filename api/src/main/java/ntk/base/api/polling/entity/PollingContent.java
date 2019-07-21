package ntk.base.api.polling.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class PollingContent extends BaseModuleEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("ModuleCoreCreatedBy")
    public String ModuleCoreCreatedBy;

    @SerializedName("ModuleCoreUpdatedBy")
    public String ModuleCoreUpdatedBy;

    @SerializedName("ViewStatisticsBeforeVote")
    public Boolean ViewStatisticsBeforeVote;

    @SerializedName("ViewStatisticsAfterVote")
    public Boolean ViewStatisticsAfterVote;

    @SerializedName("Source")
    public String Source;

    @SerializedName("virtual_Category")
    public PollingCategory virtual_Category;

    @SerializedName("Category")
    public PollingCategory Category;

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
    public Long LinkFileMovieId;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

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
    public String MainImageSrc;

    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;

    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;

    @SerializedName("Question")
    public String Question;

    @SerializedName("MaxVoteForThisContent")
    public int MaxVoteForThisContent;

    @SerializedName("MaxVoteForEachOption")
    public int MaxVoteForEachOption;

    @SerializedName("Options")
    public List<PollingOption> Options;
}