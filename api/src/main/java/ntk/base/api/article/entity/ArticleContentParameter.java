package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ArticleContentParameter extends BaseModuleEntity {

    @SerializedName("AdminDefaultValue")
    public String AdminDefaultValue;

    @SerializedName("LinkContentParameterTypeId")
    public Long LinkContentParameterTypeId;

    @SerializedName("LinkExternalCoreCmsSiteCategoryId")
    public Long LinkExternalCoreCmsSiteCategoryId;

    @SerializedName("LinkModuleCategoryId")
    public Long LinkModuleCategoryId;

    @SerializedName("ParameterName")
    public String ParameterName;

    @SerializedName("SiteDefaultValue")
    public String SiteDefaultValue;

    @SerializedName("UserDefaultValue")
    public String UserDefaultValue;
}