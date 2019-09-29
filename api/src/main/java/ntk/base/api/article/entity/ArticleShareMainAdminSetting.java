package ntk.base.api.article.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ArticleShareMainAdminSetting extends BaseModuleEntity {

    @SerializedName("AdminMainPriceFixed")
    public Long AdminMainPriceFixed;

    @SerializedName("AdminMainPricePercent")
    public Long AdminMainPricePercent;

    @SerializedName("Description")
    public String Description;

    @SerializedName("PaymentMethod")
    public int PaymentMethod;

    @SerializedName("ReciverPriceCost")
    public Long ReciverPriceCost;

    @SerializedName("Title")
    public String Title;
}