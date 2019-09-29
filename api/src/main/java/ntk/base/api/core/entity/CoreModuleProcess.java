package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class CoreModuleProcess extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleML")
    public String TitleML;

    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;

    @SerializedName("TitleEn")
    public String TitleEn;

    @SerializedName("ProcessName")
    public String ProcessName;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkModuleId")
    public Long LinkModuleId;

    @SerializedName("virtual_CmsModule")
    public CoreModule virtual_CmsModule;

    @SerializedName("CmsModule")
    public CoreModule CmsModule;

    @SerializedName("CmsModuleProcessCustomize")
    public List<CoreModuleProcessCustomize> CmsModuleProcessCustomize;
}