package ntk.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.file.entity.FileShareReciverCategory;
import ntk.base.api.model.ErrorException;

public class FileShareReciverCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<FileShareReciverCategory> ListItems;

    @SerializedName("Item")
    public FileShareReciverCategory Item;
}
