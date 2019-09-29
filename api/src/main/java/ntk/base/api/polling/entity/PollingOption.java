package ntk.base.api.polling.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseModuleEntity;

public class PollingOption extends BaseModuleEntity {

    @SerializedName("Option")
    public String Option;

    @SerializedName("OptionAnswer")
    public String OptionAnswer;

    @SerializedName("IsCorrectAnswer")
    public Boolean IsCorrectAnswer;

    @SerializedName("NumberOfVotes")
    public int NumberOfVotes;

    @SerializedName("ScoreOfVotes")
    public int ScoreOfVotes;

    @SerializedName("LinkPollingContentId")
    public Long LinkPollingContentId;

    @SerializedName("virtual_PollingContent")
    public PollingContent virtual_PollingContent;

    @SerializedName("PollingContent")
    public PollingContent PollingContent;
}