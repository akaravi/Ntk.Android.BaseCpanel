package ntk.base.api.polling.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class PollingCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public PollingCategory Category;

    @SerializedName("virtual_Category")
    public PollingCategory virtual_Category;

    @SerializedName("Children")
    public List<PollingCategory> Children;

    @SerializedName("Contents")
    public List<PollingContent> Contents;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FontIcon")
    public String FontIcon;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;
}