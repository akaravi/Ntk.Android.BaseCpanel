package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ImageGalleryContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryContentOtherInfo> ListItems;

    @SerializedName("Item")
    public ImageGalleryContentOtherInfo Item;
}
