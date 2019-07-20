package ntk.base.api.blog.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseModuleEntity;

public class BlogContentOtherInfo extends BaseModuleEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Source")
    public String Source;

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("TypeId")
    public int TypeId;

    @SerializedName("virtual_BlogContent")
    public BlogContent virtual_BlogContent;

    @SerializedName("BlogContent")
    public BlogContent BlogContent;
}