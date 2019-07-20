package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ArticleContentTag extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkTagId")
    public Long LinkTagId;

    @SerializedName("virtual_ModuleContent")
    public ArticleContent virtual_ModuleContent;

    @SerializedName("ModuleContent")
    public ArticleContent ModuleContent;

    @SerializedName("virtual_ModuleTag")
    public ArticleTag virtual_ModuleTag;

    @SerializedName("ModuleTag")
    public ArticleTag ModuleTag;
}