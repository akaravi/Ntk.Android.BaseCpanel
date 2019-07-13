package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class ApplicationThemeConfig extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TypeId")
    public String TypeId;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("virtual_Source")
    public ApplicationSource virtual_Source;

    @SerializedName("Source")
    public ApplicationSource Source;

    @SerializedName("ThemeConfigBuilderJsonValues")
    public String ThemeConfigBuilderJsonValues;

    @SerializedName("ThemeConfigRuntimeJsonValues")
    public String ThemeConfigRuntimeJsonValues;

    @SerializedName("ThemeConfigLayoutJsonValues")
    public String ThemeConfigLayoutJsonValues;

    @SerializedName("ThemeConfigJsonValues")
    public String ThemeConfigJsonValues;

    @SerializedName("ThemeConfigLayouts")
    public String ThemeConfigLayouts;

    @SerializedName("Applications")
    public List<ApplicationApp> Applications;
}