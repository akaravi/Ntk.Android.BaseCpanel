package ntk.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseCoreEntity;

public class CorePageTemplate extends BaseCoreEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("Folder")
    public String Folder;

    @SerializedName("IndexFile")
    public String IndexFile;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Pages")
    public List<CorePage> Pages;
}