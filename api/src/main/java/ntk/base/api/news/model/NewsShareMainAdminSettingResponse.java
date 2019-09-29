package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.entity.NewsShareMainAdminSetting;

public class NewsShareMainAdminSettingResponse extends ErrorException {


    @SerializedName("ListItems")
    public List<NewsShareMainAdminSetting> ListItems;

    @SerializedName("Item")
    public NewsShareMainAdminSetting Item;
}
