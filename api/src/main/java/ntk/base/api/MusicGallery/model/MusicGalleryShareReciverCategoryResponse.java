package ntk.base.api.MusicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MusicGallery.entity.MusicGalleryShareReciverCategory;
import ntk.base.api.model.ErrorException;

public class MusicGalleryShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryShareReciverCategory> ListItems;

    @SerializedName("Item")
    public MusicGalleryShareReciverCategory Item;
}
