package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryCategory;
import ntk.base.api.model.ErrorException;

public class ImageGalleryCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryCategory> ListItems;

    @SerializedName("Item")
    public ImageGalleryCategory Item;
}
