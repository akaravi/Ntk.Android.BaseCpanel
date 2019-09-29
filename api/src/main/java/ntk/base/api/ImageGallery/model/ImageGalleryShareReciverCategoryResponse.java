package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryShareReciverCategory;
import ntk.base.api.baseModel.ErrorException;

public class ImageGalleryShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryShareReciverCategory> ListItems;

    @SerializedName("Item")
    public ImageGalleryShareReciverCategory Item;
}
