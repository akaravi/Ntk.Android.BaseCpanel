package ntk.base.api.MusicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.MusicGallery.entity.MusicGalleryContent;
import ntk.base.api.baseModel.ErrorException;

public class MusicGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryContent> ListItems;

    @SerializedName("Item")
    public MusicGalleryContent Item;
}
