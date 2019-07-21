package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryCategory;
import ntk.base.api.model.ErrorException;

public class MovieGalleryCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryCategory> ListItems;

    @SerializedName("Item")
    public MovieGalleryCategory Item;
}
