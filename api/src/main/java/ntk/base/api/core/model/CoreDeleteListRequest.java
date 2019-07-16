package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoreDeleteListRequest {

    @SerializedName("List")
    public List<String> List;
}
