package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserloginRequest {

    @SerializedName("username")
    public String username;

    @SerializedName("pwd")
    public String pwd;

    @SerializedName("lang")
    public String lang;
}
