package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class CoreModuleProcessCustomize extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleEn")
    public String TitleEn;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkModuleProcessId")
    public Long LinkModuleProcessId;

    @SerializedName("virtual_CmsModuleProcess")
    public CoreModuleProcess virtual_CmsModuleProcess;

    @SerializedName("CmsModuleProcess")
    public CoreModuleProcess CmsModuleProcess;

    @SerializedName("ProcessInputCustomizeValue")
    public String ProcessInputCustomizeValue;

    @SerializedName("ProcessInputValueForm")
    public String ProcessInputValueForm;

    @SerializedName("LinkProcessCustomizeDependenceBeforRunId")
    public Long LinkProcessCustomizeDependenceBeforRunId;
}