package ntk.base.api.MovieGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class MovieGalleryContentTag extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkTagId")
    public Long LinkTagId;

    @SerializedName("virtual_ModuleContent")
    public MovieGalleryContent virtual_ModuleContent;

    @SerializedName("ModuleContent")
    public MovieGalleryContent ModuleContent;

    @SerializedName("virtual_ModuleTag")
    public MovieGalleryTag virtual_ModuleTag;

    @SerializedName("ModuleTag")
    public MovieGalleryTag ModuleTag;
}