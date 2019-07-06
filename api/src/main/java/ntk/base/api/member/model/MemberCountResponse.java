package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MemberCountResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MemberCount> ListItems;

    @SerializedName("Item")
    public MemberCount Item;
}
