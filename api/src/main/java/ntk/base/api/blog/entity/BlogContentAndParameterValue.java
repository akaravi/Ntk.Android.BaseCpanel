package ntk.base.api.blog.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class BlogContentAndParameterValue extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkContentParameterId")
    public Long LinkContentParameterId;

    @SerializedName("Value")
    public String Value;
}