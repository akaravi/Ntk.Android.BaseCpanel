package ntk.base.api.file.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseModuleEntity;

public class FileCategory extends BaseModuleEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("MainImageSrc")
    public String imageSrc;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;

    @SerializedName("Children")
    public List<FileCategory> Children;
}
