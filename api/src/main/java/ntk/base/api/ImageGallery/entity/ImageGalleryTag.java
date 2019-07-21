package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ImageGalleryTag extends BaseModuleEntity {

    @SerializedName("LinkCategoryTagId")
    public Long LinkCategoryTagId;

    @SerializedName("Title")
    public String Title;
}