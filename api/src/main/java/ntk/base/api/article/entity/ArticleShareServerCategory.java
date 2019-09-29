package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ArticleShareServerCategory extends BaseModuleEntity {

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkShareMainAdminSettingId")
    public Long LinkShareMainAdminSettingId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkServerCategoryId")
    public Long LinkServerCategoryId;
}