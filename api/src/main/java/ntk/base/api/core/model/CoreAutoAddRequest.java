package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class CoreAutoAddRequest extends FilterModel {

    @SerializedName("LinkSourceId")
    public Long LinkSourceId;
}
