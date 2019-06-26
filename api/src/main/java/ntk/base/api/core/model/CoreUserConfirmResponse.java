package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class CoreUserConfirmResponse extends ErrorException {

    @SerializedName("ActivateShortCode")
    public String ActivateShortCode;

    @SerializedName("ActivateCode")
    public String ActivateCode;

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("Email")
    public String Email;

    @SerializedName("ConfirmAccountType") //TODO >>>
    public int ConfirmAccountType;

}
