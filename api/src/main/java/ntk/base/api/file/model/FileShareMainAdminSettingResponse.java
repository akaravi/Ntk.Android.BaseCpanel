package ntk.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.file.entity.FileShareMainAdminSetting;
import ntk.base.api.model.ErrorException;

public class FileShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<FileShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public FileShareMainAdminSetting Item;
}
