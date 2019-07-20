package ntk.base.api.Blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.Blog.entity.BlogShareMainAdminSetting;
import ntk.base.api.model.ErrorException;

public class BlogShareMainAdminSettingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public BlogShareMainAdminSetting Item;
}
