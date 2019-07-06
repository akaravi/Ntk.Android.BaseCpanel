package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseEntity;

class MemberUser extends BaseEntity {

    @SerializedName("BirthPlace")
    public String BirthPlace;

    @SerializedName("Address")
    public String Address;

    @SerializedName("DateBirth")
    public String DateBirth;

    @SerializedName("DeviceId")
    public String DeviceId;

    @SerializedName("InstagramId")
    public String InstagramId;

    @SerializedName("JoinId")
    public Long JoinId;

    @SerializedName("GeolocationString")
    public String GeolocationString;

    @SerializedName("Source")
    public String Source;

    @SerializedName("Comments")
    public String Comments;

    @SerializedName("virtual_Category")
    public String virtual_Category;

    @SerializedName("OtherInfo")
    public String OtherInfo;

    @SerializedName("ContentTags")
    public String ContentTags;

    @SerializedName("Similars")
    public String Similars;

    @SerializedName("OtherInfos")
    public String OtherInfos;

    @SerializedName("ContentAndParameterValues")
    public String ContentAndParameterValues;

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

    @SerializedName("Id")
    public int Id;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("CreateAntiInjectionValue")
    public Boolean CreateAntiInjectionValue;

    @SerializedName("TokenActionState")
    public int TokenActionState;

    @SerializedName("AntiInjectionExpiredMinute")
    public int AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;
}
