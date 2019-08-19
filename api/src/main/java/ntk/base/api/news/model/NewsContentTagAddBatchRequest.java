package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.news.entity.NewsContentTag;

public class NewsContentTagAddBatchRequest {

    @SerializedName("List")
    public List<NewsContentTag> List;
}
