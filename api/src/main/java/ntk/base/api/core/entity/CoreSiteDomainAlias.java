package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class CoreSiteDomainAlias extends BaseModuleEntity {

    @SerializedName("SubDomain")
    public String SubDomain;

    @SerializedName("Domain")
    public String Domain;

    @SerializedName("Redirect")
    public String Redirect;

    @SerializedName("LinkCmsSiteId")
    public Long LinkCmsSiteId;

    @SerializedName("virtual_CmsSite")
    public CoreSite virtual_CmsSite;

    @SerializedName("CmsSite")
    public CoreSite CmsSite;
}