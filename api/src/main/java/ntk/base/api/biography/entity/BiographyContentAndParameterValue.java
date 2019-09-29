package ntk.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

class BiographyContentAndParameterValue extends BaseModuleEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkContentParameterId")
    public Long LinkContentParameterId;

    @SerializedName("Value")
    public String Value;
}