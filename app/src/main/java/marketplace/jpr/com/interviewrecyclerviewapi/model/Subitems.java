
package marketplace.jpr.com.interviewrecyclerviewapi.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subitems {

    @SerializedName("p_price")
    @Expose
    private String pPrice;
    @SerializedName("p_disc_price")
    @Expose
    private String pDiscPrice;
    @SerializedName("p_title")
    @Expose
    private String pTitle;
    @SerializedName("p_islock_status")
    @Expose
    private String pIslockStatus;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("Highlight")
    @Expose
    private List<Highlight> highlight = null;
    @SerializedName("info")
    @Expose
    private List<Info> info = null;

    public String getPPrice() {
        return pPrice;
    }

    public void setPPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public String getPDiscPrice() {
        return pDiscPrice;
    }

    public void setPDiscPrice(String pDiscPrice) {
        this.pDiscPrice = pDiscPrice;
    }

    public String getPTitle() {
        return pTitle;
    }

    public void setPTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getPIslockStatus() {
        return pIslockStatus;
    }

    public void setPIslockStatus(String pIslockStatus) {
        this.pIslockStatus = pIslockStatus;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Highlight> getHighlight() {
        return highlight;
    }

    public void setHighlight(List<Highlight> highlight) {
        this.highlight = highlight;
    }

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }

}
