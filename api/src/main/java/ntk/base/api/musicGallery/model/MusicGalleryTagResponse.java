package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MusicGalleryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryTag> ListItems;

    @SerializedName("Item")
    public MusicGalleryTag Item;
}
