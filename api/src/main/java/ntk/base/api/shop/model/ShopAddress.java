package ntk.base.api.shop.model;

import com.google.gson.annotations.SerializedName;

class ShopAddress {

    @SerializedName("ReceiverAddress")
    public String ReceiverAddress;

    @SerializedName("ReceiverCity")
    public String ReceiverCity;

    @SerializedName("ReceiverLastName")
    public String ReceiverLastName;

    @SerializedName("ReceiverMemo")
    public String ReceiverMemo;

    @SerializedName("ReceiverMobile")
    public String ReceiverMobile;

    @SerializedName("ReceiverName")
    public String ReceiverName;

    @SerializedName("ReceiverOstan")
    public String ReceiverOstan;

    @SerializedName("ReceiverPostalCode")
    public String ReceiverPostalCode;

    @SerializedName("ReceiverTe")
    public String ReceiverTe;
}
