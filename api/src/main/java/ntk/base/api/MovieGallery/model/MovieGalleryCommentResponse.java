package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryComment;
import ntk.base.api.baseModel.ErrorException;

public class MovieGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryComment> ListItems;

    @SerializedName("Item")
    public MovieGalleryComment Item;
}
