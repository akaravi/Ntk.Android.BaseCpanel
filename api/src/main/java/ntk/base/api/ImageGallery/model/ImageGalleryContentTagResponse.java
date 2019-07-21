package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryContentTag;
import ntk.base.api.model.ErrorException;

public class ImageGalleryContentTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryContentTag> ListItems;

    @SerializedName("Item")
    public ImageGalleryContentTag Item;
}
