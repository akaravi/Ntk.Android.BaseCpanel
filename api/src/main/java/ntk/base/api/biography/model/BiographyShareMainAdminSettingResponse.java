package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.entity.BiographyShareMainAdminSetting;
import ntk.base.api.baseModel.ErrorException;

public class BiographyShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public BiographyShareMainAdminSetting Item;
}
