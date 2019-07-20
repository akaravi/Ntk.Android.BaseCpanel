package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ArticleContentSimilar extends BaseModuleEntity {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("LinkDestinationId")
    public Long LinkDestinationId;

    @SerializedName("virtual_Source")
    public ArticleContent virtual_Source;

    @SerializedName("Source")
    public ArticleContent Source;

    @SerializedName("virtual_Destination")
    public ArticleContent virtual_Destination;

    @SerializedName("Destination")
    public ArticleContent Destination;
}