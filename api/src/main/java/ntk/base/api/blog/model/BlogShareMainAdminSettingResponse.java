package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.blog.entity.BlogShareMainAdminSetting;
import ntk.base.api.baseModel.ErrorException;

public class BlogShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public BlogShareMainAdminSetting Item;
}
