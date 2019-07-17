package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseCoreEntity;

public class CoreSiteMenu extends BaseCoreEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("AreaType")
    public String AreaType;

    @SerializedName("JsonValues")
    public String JsonValues;

    @SerializedName("virtual_CmsSite")
    public String virtual_CmsSite;

    @SerializedName("CmsSite")
    public String CmsSite;
}