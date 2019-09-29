package ntk.base.api.MovieGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

class MovieGalleryContentSimilar extends BaseModuleEntity {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("LinkDestinationId")
    public Long LinkDestinationId;

    @SerializedName("virtual_Source")
    public MovieGalleryContent virtual_Source;

    @SerializedName("Source")
    public MovieGalleryContent Source;

    @SerializedName("virtual_Destination")
    public MovieGalleryContent virtual_Destination;

    @SerializedName("Destination")
    public MovieGalleryContent Destination;
}