package ntk.base.api.MusicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MusicGallery.entity.MusicGalleryShareServerCategory;
import ntk.base.api.model.ErrorException;

public class MusicGalleryShareServerCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryShareServerCategory> ListItems;

    @SerializedName("Item")
    public MusicGalleryShareServerCategory Item;
}
