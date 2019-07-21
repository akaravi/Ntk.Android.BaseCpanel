package ntk.base.api.MovieGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class MovieGalleryShareServerCategory extends BaseModuleEntity {

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkShareMainAdminSettingId")
    public Long LinkShareMainAdminSettingId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkServerCategoryId")
    public Long LinkServerCategoryId;
}