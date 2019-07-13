package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ApplicationLayout extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("ClassName")
    public String ClassName;

    @SerializedName("LinkSourceId")
    public String LinkSourceId;

    @SerializedName("virtual_Source")
    public String virtual_Source;

    @SerializedName("Source")
    public String Source;

    @SerializedName("JsonFormDefaultValue")
    public String JsonFormDefaultValue;

    @SerializedName("JsonFormAdminSystemValue")
    public String JsonFormAdminSystemValue;

    @SerializedName("LinkModuleFilePreviewImageId")
    public String LinkModuleFilePreviewImageId;

    @SerializedName("LayoutValues")
    public String LayoutValues;
}