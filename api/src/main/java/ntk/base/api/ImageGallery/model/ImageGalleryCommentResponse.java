package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryComment;
import ntk.base.api.baseModel.ErrorException;

public class ImageGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryComment> ListItems;

    @SerializedName("Item")
    public ImageGalleryComment Item;
}
