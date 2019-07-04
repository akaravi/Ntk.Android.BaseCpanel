package ntk.base.api.auth.model;

import com.google.gson.annotations.SerializedName;

class AuthSiteStorage {

    @SerializedName("MainDataContentRowCount")
    public int MainDataContentRowCount;

    @SerializedName("RowCount")
    public Boolean RowCount;

    @SerializedName("SumSizeUploadMB")
    public String SumSizeUploadMB;

    @SerializedName("UpdatedContent")
    public String UpdatedContent;
}
