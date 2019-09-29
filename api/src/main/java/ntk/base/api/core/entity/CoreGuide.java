package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class CoreGuide extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("BodyFa")
    public String BodyFa;

    @SerializedName("BodyEn")
    public String BodyEn;

    @SerializedName("BodyAr")
    public String BodyAr;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("virtual_Parent")
    public CoreUserGroup virtual_Parent;

    @SerializedName("Parent")
    public CoreUserGroup Parent;

    @SerializedName("Children")
    public List<CoreUserGroup> Children;
}