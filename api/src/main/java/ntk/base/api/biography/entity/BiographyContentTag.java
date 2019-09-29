package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class BiographyContentTag extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkTagId")
    public Long LinkTagId;

    @SerializedName("virtual_ModuleContent")
    public BiographyContent virtual_ModuleContent;

    @SerializedName("ModuleContent")
    public BiographyContent ModuleContent;

    @SerializedName("virtual_ModuleTag")
    public BiographyTag virtual_ModuleTag;

    @SerializedName("ModuleTag")
    public BiographyTag ModuleTag;
}