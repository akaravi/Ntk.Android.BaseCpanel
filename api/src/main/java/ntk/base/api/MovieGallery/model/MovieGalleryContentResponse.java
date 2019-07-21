package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryContent;
import ntk.base.api.model.ErrorException;

public class MovieGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContent> ListItems;

    @SerializedName("Item")
    public MovieGalleryContent Item;
}
