package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class BiographyShareReciverCategory extends BaseModuleEntity {

    @SerializedName("FromDate")
    public String FromDate;

    @SerializedName("LinkShareReciverCategoryId")
    public Long LinkShareReciverCategoryId;

    @SerializedName("LinkShareServerCategoryId")
    public Long LinkShareServerCategoryId;

    @SerializedName("ExpireDate")
    public String ExpireDate;
}
