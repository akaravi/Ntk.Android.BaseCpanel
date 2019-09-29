package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.core.entity.CoreSiteDomainAlias;
import ntk.base.api.baseModel.ErrorException;

public class CoreSiteDomainAliasResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<CoreSiteDomainAlias> ListItems;

    @SerializedName("Item")
    public CoreSiteDomainAlias Item;
}
