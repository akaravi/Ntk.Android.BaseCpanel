package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MusicGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryContent> ListItems;

    @SerializedName("Item")
    public MusicGalleryContent Item;
}
