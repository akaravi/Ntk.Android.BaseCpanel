package ntk.base.api.MusicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MusicGallery.entity.MusicGalleryTag;
import ntk.base.api.baseModel.ErrorException;

public class MusicGalleryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryTag> ListItems;

    @SerializedName("Item")
    public MusicGalleryTag Item;
}
