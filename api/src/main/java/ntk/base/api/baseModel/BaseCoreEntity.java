package ntk.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

public class BaseCoreEntity {

    @SerializedName("RecordStatus")
    public int RecordStatus;

    @SerializedName("CreatedDate")
    public String CreatedDate;

    @SerializedName("CreatedBy")
    public Long CreatedBy;

    @SerializedName("UpdatedDate")
    public String UpdatedDate;

    @SerializedName("UpdatedBy")
    public Long UpdatedBy;

    @SerializedName("DataMemoId")
    public Long DataMemoId;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("ContentAndParameterValues")
    public String ContentAndParameterValues;

    @SerializedName("CreateAntiInjectionValue")
    public Boolean CreateAntiInjectionValue;

    @SerializedName("TokenActionState")
    public String TokenActionState;

    @SerializedName("AntiInjectionExpiredMinute")
    public int AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;

    @SerializedName("Id")
    public Long Id;
}
