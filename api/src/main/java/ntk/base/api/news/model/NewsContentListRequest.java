package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.FilterModel;

public class NewsContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;


}
