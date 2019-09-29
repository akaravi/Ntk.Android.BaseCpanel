package ntk.base.api.MusicGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class MusicGalleryTag extends BaseModuleEntity {

    @SerializedName("LinkCategoryTagId")
    public Long LinkCategoryTagId;

    @SerializedName("Title")
    public String Title;
}