package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class NewsContentGetAllWithSimilarIdRequest extends FilterModel {

    @SerializedName("Id")
    public String Id;
}
