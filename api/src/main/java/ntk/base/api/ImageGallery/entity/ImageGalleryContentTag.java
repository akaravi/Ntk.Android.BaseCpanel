package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ImageGalleryContentTag extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkTagId")
    public Long LinkTagId;

    @SerializedName("virtual_ModuleContent")
    public ImageGalleryContent virtual_ModuleContent;

    @SerializedName("ModuleContent")
    public ImageGalleryContent ModuleContent;

    @SerializedName("virtual_ModuleTag")
    public ImageGalleryTag virtual_ModuleTag;

    @SerializedName("ModuleTag")
    public ImageGalleryTag ModuleTag;
}