package ntk.base.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilterModel {

    @SerializedName("Count")
    public boolean Count;

    @SerializedName("TotalRowData")
    public int TotalRowData;

    @SerializedName("SkipRowData")
    public int SkipRowData;

    @SerializedName("CurrentPageNumber")
    public int CurrentPageNumber;

    @SerializedName("RowPerPage")
    public int RowPerPage;

    @SerializedName("SortType")
    public int SortType;

    @SerializedName("SortColumn")
    public String SortColumn;

    @SerializedName("Filters")
    public List<Filters> filters;

    @SerializedName("NeedToRunFakePagination")
    public Boolean NeedToRunFakePagination;

    @SerializedName("ContentFullSearch")
    public String ContentFullSearch;
}
