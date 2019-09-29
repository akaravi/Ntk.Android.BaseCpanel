package ntk.base.api.MovieGallery.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseModuleEntity;

public class MovieGalleryCategory extends BaseModuleEntity {

    @SerializedName("Category")
    public MovieGalleryCategory Category;

    @SerializedName("virtual_Category")
    public MovieGalleryCategory virtual_Category;

    @SerializedName("ShareServerCategories")
    public List<MovieGalleryShareServerCategory> ShareServerCategories;

    @SerializedName("ShareReciverCategories")
    public List<MovieGalleryShareReciverCategory> ShareReciverCategories;

    @SerializedName("Children")
    public List<MovieGalleryCategory> Children;

    @SerializedName("Contents")
    public List<MovieGalleryContent> Contents;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FontIcon")
    public String FontIcon;

    @SerializedName("LinkMainMovieId")
    public Long LinkMainMovieId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkMainMovieSrc")
    public String LinkMainMovieSrc;
}