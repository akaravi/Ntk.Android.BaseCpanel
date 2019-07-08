package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserLoginRequest {

    @SerializedName("lang")
    public String lang;

    @SerializedName("pwd")
    public String pwd;

    @SerializedName("username")
    public String username;
}
