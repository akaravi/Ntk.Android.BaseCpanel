package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class PoolingContentListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PoolingContent> ListItems;

    @SerializedName("Item")
    public PoolingContent Item;
}
