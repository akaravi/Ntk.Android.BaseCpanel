package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class ApplicationLayoutValue extends BaseModuleEntity {

    @SerializedName("LinkApplicationId")
    public String LinkApplicationId;

    @SerializedName("virtual_Application")
    public String virtual_Application;

    @SerializedName("Application")
    public String Application;

    @SerializedName("LinkLayoutId")
    public String LinkLayoutId;

    @SerializedName("virtual_Layout")
    public String virtual_Layout;

    @SerializedName("Layout")
    public String Layout;

    @SerializedName("JsonFormValues")
    public String JsonFormValues;
}
