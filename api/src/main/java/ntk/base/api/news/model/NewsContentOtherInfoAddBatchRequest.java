package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.news.entity.NewsContentOtherInfo;

public class NewsContentOtherInfoAddBatchRequest {

    @SerializedName("List")
    public List<NewsContentOtherInfo> List;
}
