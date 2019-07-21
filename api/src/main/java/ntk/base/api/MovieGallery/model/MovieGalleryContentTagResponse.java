package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryContentTag;
import ntk.base.api.model.ErrorException;

public class MovieGalleryContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContentTag> ListItems;

    @SerializedName("Item")
    public MovieGalleryContentTag Item;
}
