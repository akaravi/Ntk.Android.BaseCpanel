package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.FilterModel;
import retrofit2.http.PUT;

public class BiographyContentWithSimilarLocationPeriodStartRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;

    @SerializedName("LocationId")
    public Long LocationId;
}
