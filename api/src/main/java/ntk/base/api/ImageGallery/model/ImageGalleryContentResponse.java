package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryContent;
import ntk.base.api.baseModel.ErrorException;

public class ImageGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryContent> ListItems;

    @SerializedName("Item")
    public ImageGalleryContent Item;
}
