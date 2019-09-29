package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ApplicationLogNotification extends BaseModuleEntity {

    @SerializedName("LinkApplicationMemberId")
    public List<String> LinkApplicationMemberId;

    @SerializedName("LinkApplicationId")
    public Long LinkApplicationId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Content")
    public String Content;

    @SerializedName("ContentType")
    public int ContentType;

    @SerializedName("ContentJson")
    public String ContentJson;

    @SerializedName("ContentJsonClass")
    public String ContentJsonClass;

    @SerializedName("SmallImageId")
    public Long SmallImageId;

    @SerializedName("BigImageId")
    public Long BigImageId;

    @SerializedName("SmallImageIdSrc")
    public String SmallImageIdSrc;

    @SerializedName("BigImageIdSrc")
    public String BigImageIdSrc;
}