package ntk.base.api.MusicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MusicGallery.entity.MusicGalleryShareMainAdminSetting;
import ntk.base.api.baseModel.ErrorException;

public class MusicGalleryShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public MusicGalleryShareMainAdminSetting Item;
}
