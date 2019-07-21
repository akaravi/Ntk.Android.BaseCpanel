package ntk.base.api.MovieGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class MovieGalleryShareReciverCategory extends BaseModuleEntity {

    @SerializedName("FromDate")
    public String FromDate;

    @SerializedName("LinkShareReciverCategoryId")
    public Long LinkShareReciverCategoryId;

    @SerializedName("LinkShareServerCategoryId")
    public Long LinkShareServerCategoryId;

    @SerializedName("ExpireDate")
    public String ExpireDate;
}