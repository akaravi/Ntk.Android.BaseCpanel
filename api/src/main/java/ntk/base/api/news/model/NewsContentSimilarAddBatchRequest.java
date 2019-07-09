package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.news.entity.NewsContentSimilar;

public class NewsContentSimilarAddBatchRequest {

    @SerializedName("list")
    public List<NewsContentSimilar> List;
}
