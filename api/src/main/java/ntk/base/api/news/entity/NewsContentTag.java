package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class NewsContentTag extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkTagId")
    public Long LinkTagId;

    @SerializedName("virtual_ModuleContent")
    public NewsContent virtual_ModuleContent;

    @SerializedName("ModuleContent")
    public NewsContent ModuleContent;

    @SerializedName("virtual_ModuleTag")
    public NewsTag virtual_ModuleTag;

    @SerializedName("ModuleTag")
    public NewsTag ModuleTag;
}
