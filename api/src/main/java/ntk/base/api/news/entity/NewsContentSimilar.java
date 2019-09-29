package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class NewsContentSimilar extends BaseModuleEntity {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("LinkDestinationId")
    public Long LinkDestinationId;

    @SerializedName("ModuleCoreUpdatedBy")
    public NewsContent ModuleCoreUpdatedBy;

    @SerializedName("Source")
    public NewsContent Source;

    @SerializedName("virtual_Source")
    public NewsContent virtual_Source;

    @SerializedName("virtual_Destination")
    public String virtual_Destination;

    @SerializedName("Destination")
    public NewsContent Destination;
}
