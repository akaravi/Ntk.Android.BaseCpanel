package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryShareReciverCategory;
import ntk.base.api.model.ErrorException;

public class MovieGalleryShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryShareReciverCategory> ListItems;

    @SerializedName("Item")
    public MovieGalleryShareReciverCategory Item;
}
