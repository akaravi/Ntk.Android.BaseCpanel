package ntk.base.api.blog.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class BlogContentSimilar extends BaseModuleEntity {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;

    @SerializedName("LinkDestinationId")
    public Long LinkDestinationId;

    @SerializedName("virtual_Source")
    public BlogContent virtual_Source;

    @SerializedName("Source")
    public BlogContent Source;

    @SerializedName("virtual_Destination")
    public BlogContent virtual_Destination;

    @SerializedName("Destination")
    public BlogContent Destination;
}