package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class CoreLogError extends BaseModuleEntity {

    @SerializedName("ModuleName")
    public String ModuleName;

    @SerializedName("ModuleEntityName")
    public String ModuleEntityName;

    @SerializedName("linkUserId")
    public Long linkUserId;

    @SerializedName("linkMemberUserId")
    public Long linkMemberUserId;

    @SerializedName("EntityId")
    public Long EntityId;
}