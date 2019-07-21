package ntk.base.api.ImageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ImageGallery.entity.ImageGalleryShareMainAdminSetting;
import ntk.base.api.model.ErrorException;

public class ImageGalleryShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public ImageGalleryShareMainAdminSetting Item;
}
