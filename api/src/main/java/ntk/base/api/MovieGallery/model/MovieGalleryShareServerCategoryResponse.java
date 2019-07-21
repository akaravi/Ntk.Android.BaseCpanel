package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryShareServerCategory;
import ntk.base.api.model.ErrorException;

public class MovieGalleryShareServerCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryShareServerCategory> ListItems;

    @SerializedName("Item")
    public MovieGalleryShareServerCategory Item;
}
