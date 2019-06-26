package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PoolingSubmitRequest {

    @SerializedName("ContentId")
    public Long ContentId;

    @SerializedName("Votes")
    public List<PoolingVote> votes;
}
