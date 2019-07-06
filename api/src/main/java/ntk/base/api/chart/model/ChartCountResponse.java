package ntk.base.api.chart.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChartCountResponse {

    @SerializedName("ListItems")
    public List<ChartCount> ListItems;

    @SerializedName("Item")
    public ChartCount Item;
}
