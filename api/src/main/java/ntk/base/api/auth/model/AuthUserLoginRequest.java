package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

public class AuthUserLoginRequest {

    @SerializedName("lang")
    public String lang;

    @SerializedName("pwd")
    public String pwd;

    @SerializedName("username")
    public String username;
}
