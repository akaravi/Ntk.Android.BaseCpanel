package ntk.base.api.MusicGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

class MusicGalleryContentSimilar extends BaseModuleEntity {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("LinkDestinationId")
    public Long LinkDestinationId;

    @SerializedName("virtual_Source")
    public MusicGalleryContent virtual_Source;

    @SerializedName("Source")
    public MusicGalleryContent Source;

    @SerializedName("virtual_Destination")
    public MusicGalleryContent virtual_Destination;

    @SerializedName("Destination")
    public MusicGalleryContent Destination;
}