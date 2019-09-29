package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseCoreEntity;

public class CoreSiteCategoryCmsModule extends BaseCoreEntity {

    @SerializedName("LinkCmsSiteCategoryId")
    public Long LinkCmsSiteCategoryId;

    @SerializedName("virtual_CmsSiteCategory")
    public CoreSiteCategory virtual_CmsSiteCategory;

    @SerializedName("CmsSiteCategory")
    public CoreSiteCategory CmsSiteCategory;

    @SerializedName("LinkCmsModuleId")
    public Long LinkCmsModuleId;

    @SerializedName("virtual_CmsModule")
    public CoreModule virtual_CmsModule;

    @SerializedName("CmsModule")
    public CoreModule CmsModule;

    @SerializedName("ConfigValuesJson")
    public String ConfigValuesJson;
}