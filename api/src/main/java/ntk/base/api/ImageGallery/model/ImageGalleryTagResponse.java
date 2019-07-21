package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryTag;
import ntk.base.api.model.ErrorException;

public class ImageGalleryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryTag> ListItems;

    @SerializedName("Item")
    public ImageGalleryTag Item;
}
