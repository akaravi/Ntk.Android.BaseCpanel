package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class AuthAllRequest extends FilterModel {

    @SerializedName("ContentFullSearch")
    public String ContentFullSearch;

    @SerializedName("NeedToRunFakePagination")
    public Boolean NeedToRunFakePagination;
}