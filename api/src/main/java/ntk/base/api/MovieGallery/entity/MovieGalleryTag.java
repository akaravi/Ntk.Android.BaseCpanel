package ntk.base.api.MovieGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class MovieGalleryTag extends BaseModuleEntity {

    @SerializedName("LinkCategoryTagId")
    public Long LinkCategoryTagId;

    @SerializedName("Title")
    public String Title;
}