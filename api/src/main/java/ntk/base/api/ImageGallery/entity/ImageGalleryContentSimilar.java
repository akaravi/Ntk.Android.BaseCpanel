package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

class ImageGalleryContentSimilar extends BaseModuleEntity {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("LinkDestinationId")
    public Long LinkDestinationId;

    @SerializedName("virtual_Source")
    public ImageGalleryContent virtual_Source;

    @SerializedName("Source")
    public ImageGalleryContent Source;

    @SerializedName("virtual_Destination")
    public ImageGalleryContent virtual_Destination;

    @SerializedName("Destination")
    public ImageGalleryContent Destination;
}