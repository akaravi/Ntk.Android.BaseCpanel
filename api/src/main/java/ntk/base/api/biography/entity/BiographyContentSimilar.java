package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class BiographyContentSimilar extends BaseModuleEntity {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("LinkDestinationId")
    public Long LinkDestinationId;

    @SerializedName("virtual_Source")
    public BiographyContent virtual_Source;

    @SerializedName("Source")
    public BiographyContent Source;

    @SerializedName("virtual_Destination")
    public BiographyContent virtual_Destination;

    @SerializedName("Destination")
    public BiographyContent Destination;
}