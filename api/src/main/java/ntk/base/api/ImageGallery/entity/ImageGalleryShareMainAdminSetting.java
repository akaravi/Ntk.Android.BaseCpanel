package ntk.base.api.ImageGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class ImageGalleryShareMainAdminSetting extends BaseModuleEntity {

    @SerializedName("AdminMainPriceFixed")
    public String AdminMainPriceFixed;

    @SerializedName("AdminMainPricePercent")
    public String AdminMainPricePercent;

    @SerializedName("Description")
    public String Description;

    @SerializedName("PaymentMethod")
    public int PaymentMethod;

    @SerializedName("ReciverPriceCost")
    public String ReciverPriceCost;

    @SerializedName("Title")
    public String Title;
}