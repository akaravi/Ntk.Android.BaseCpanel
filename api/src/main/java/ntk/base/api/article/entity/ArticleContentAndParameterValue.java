package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ArticleContentAndParameterValue extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkContentParameterId")
    public Long LinkContentParameterId;

    @SerializedName("Value")
    public String Value;
}