package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.application.entity.ApplicationMemberInfo;
import ntk.base.api.model.ErrorException;

public class ApplicationMemberInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ApplicationMemberInfo> ListItems;

    @SerializedName("Item")
    public ApplicationMemberInfo Item;
}
