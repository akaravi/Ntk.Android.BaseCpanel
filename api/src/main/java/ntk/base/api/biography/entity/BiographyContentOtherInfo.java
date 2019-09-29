package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class BiographyContentOtherInfo extends BaseModuleEntity {

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

    @SerializedName("virtual_BiographyContent")
    public BiographyContent virtual_BiographyContent;

    @SerializedName("BiographyContent")
    public BiographyContent BiographyContent;
}