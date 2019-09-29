package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class NewsContentOtherInfo extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Source")
    public String Source;

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("TypeId")
    public int TypeId;

    @SerializedName("virtual_NewsContent")
    public NewsContent virtual_NewsContent;

    @SerializedName("NewsContent")
    public NewsContent NewsContent;

    @SerializedName("OtherInfos")
    public NewsContentOtherInfo OtherInfos;

    @SerializedName("FromDate")
    public String FromDate;
}
