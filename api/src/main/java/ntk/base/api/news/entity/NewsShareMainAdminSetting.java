package ntk.base.api.news.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class NewsShareMainAdminSetting extends BaseModuleEntity {

    @SerializedName("AdminMainPriceFixed")
    public String AdminMainPriceFixed;

    @SerializedName("AdminMainPricePercent")
    public Long AdminMainPricePercent;

    @SerializedName("Description")
    public Long Description;

    @SerializedName("PaymentMethod")
    public String PaymentMethod;

    @SerializedName("ReciverPriceCost")
    public String ReciverPriceCost;

    @SerializedName("Title")
    public String Title;
}
