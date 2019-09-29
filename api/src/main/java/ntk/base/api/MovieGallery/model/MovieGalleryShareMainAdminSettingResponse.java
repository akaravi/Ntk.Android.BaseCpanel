package ntk.base.api.MovieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MovieGallery.entity.MovieGalleryShareMainAdminSetting;
import ntk.base.api.baseModel.ErrorException;

public class MovieGalleryShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public MovieGalleryShareMainAdminSetting Item;
}
