package ntk.base.api.MusicGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class MusicGalleryContentTag extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkTagId")
    public Long LinkTagId;

    @SerializedName("virtual_ModuleContent")
    public MusicGalleryContent virtual_ModuleContent;

    @SerializedName("ModuleContent")
    public MusicGalleryContent ModuleContent;

    @SerializedName("virtual_ModuleTag")
    public MusicGalleryTag virtual_ModuleTag;

    @SerializedName("ModuleTag")
    public MusicGalleryTag ModuleTag;
}