package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ApplicationIntro extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkApplicationId")
    public Long LinkApplicationId;

    @SerializedName("Application")
    public ApplicationApp Application;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;
}