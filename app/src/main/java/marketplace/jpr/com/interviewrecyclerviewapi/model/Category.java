
package marketplace.jpr.com.interviewrecyclerviewapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("cat_id")
    @Expose
    private String catId;
    @SerializedName("cat_title")
    @Expose
    private String catTitle;
    @SerializedName("cat_image")
    @Expose
    private String catImage;
    @SerializedName("cat_desc")
    @Expose
    private String catDesc;
    @SerializedName("d_title")
    @Expose
    private String dTitle;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatTitle() {
        return catTitle;
    }

    public void setCatTitle(String catTitle) {
        this.catTitle = catTitle;
    }

    public String getCatImage() {
        return catImage;
    }

    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public String getDTitle() {
        return dTitle;
    }

    public void setDTitle(String dTitle) {
        this.dTitle = dTitle;
    }

}
