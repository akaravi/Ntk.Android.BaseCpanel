package ntk.base.api.shop.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

class ShopCount extends BaseEntity {

    @SerializedName("Address")
    public ShopAddress Address;

    @SerializedName("AntiInjectionDate")
    public String AntiInjectionDate;

    @SerializedName("AntiInjectionExpireDate")
    public String AntiInjectionExpireDate;

    @SerializedName("AntiInjectionExpiredMinute")
    public Long AntiInjectionExpiredMinute;

    @SerializedName("AntiInjectionGuid")
    public String AntiInjectionGuid;

    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;

    @SerializedName("CreateAntiInjectionValue")
    public String CreateAntiInjectionValue;

    @SerializedName("DeliveryDate")
    public String DeliveryDate;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Discount")
    public String Discount;

    @SerializedName("Id")
    public String Id;

    @SerializedName("InvoiceSaleDetails")
    public String InvoiceSaleDetails;

    @SerializedName("InvoiceStatus")
    public String InvoiceStatus;

    @SerializedName("IsReleased")
    public Boolean IsReleased;

    @SerializedName("JsonAddress")
    public String JsonAddress;

    @SerializedName("LinkCartId")
    public String LinkCartId;

    @SerializedName("LinkCmsUserId")
    public String LinkCmsUserId;

    @SerializedName("LinkExternalModuleDeliveryInvoiceId")
    public String LinkExternalModuleDeliveryInvoiceId;

    @SerializedName("LinkModelBankPaymentTransactionSuccessfulId")
    public String LinkModelBankPaymentTransactionSuccessfulId;

    @SerializedName("LinkSiteId")
    public String LinkSiteId;

    @SerializedName("OnlineDateLock")
    public String OnlineDateLock;

    @SerializedName("OnlineDateUnlock")
    public String OnlineDateUnlock;

    @SerializedName("PaymentStatus")
    public String PaymentStatus;

    @SerializedName("RegisterDate")
    public String RegisterDate;

    @SerializedName("ReleaseDate")
    public String ReleaseDate;

    @SerializedName("ShopInvoiceSaleWorkFlow")
    public String ShopInvoiceSaleWorkFlow;

    @SerializedName("Tax")
    public String Tax;

    @SerializedName("TokenActionState")
    public String TokenActionState;

    @SerializedName("TotalAmount")
    public String TotalAmount;

    @SerializedName("virtual_ShopInvoiceSaleWorkFlow")
    public String virtual_ShopInvoiceSaleWorkFlow;
}
