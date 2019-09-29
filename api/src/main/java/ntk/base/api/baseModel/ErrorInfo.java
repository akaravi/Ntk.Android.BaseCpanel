package ntk.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

public class ErrorInfo {

    @SerializedName("ErrorMessage")
    public String ErrorMessage;

    @SerializedName("ErrorType")
    public int ErrorType;
}