package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseCoreEntity;

public class CoreSiteCategory extends BaseCoreEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleML")
    public String TitleML;

    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Sites")
    public List<CoreSite> Sites;
}