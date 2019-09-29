package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryShareServerCategory;
import ntk.base.api.baseModel.ErrorException;

public class ImageGalleryShareServerCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryShareServerCategory> ListItems;

    @SerializedName("Item")
    public ImageGalleryShareServerCategory Item;
}
