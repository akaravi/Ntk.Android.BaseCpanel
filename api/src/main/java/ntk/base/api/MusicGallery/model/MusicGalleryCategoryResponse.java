package ntk.base.api.MusicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MusicGallery.entity.MusicGalleryCategory;
import ntk.base.api.baseModel.ErrorException;

public class MusicGalleryCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryCategory> ListItems;

    @SerializedName("Item")
    public MusicGalleryCategory Item;
}
