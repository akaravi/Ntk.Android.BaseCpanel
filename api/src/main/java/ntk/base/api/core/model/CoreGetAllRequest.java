package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class CoreGetAllRequest extends FilterModel {

    @SerializedName("ContentFullSearch")
    public String ContentFullSearch;

    @SerializedName("NeedToRunFakePagination")
    public Boolean NeedToRunFakePagination;
}
