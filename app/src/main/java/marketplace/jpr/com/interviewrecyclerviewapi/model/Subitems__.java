
package marketplace.jpr.com.interviewrecyclerviewapi.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subitems__ {

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
    private List<Image__> images = null;
    @SerializedName("Highlight")
    @Expose
    private List<Highlight__> highlight = null;
    @SerializedName("info")
    @Expose
    private List<Info__> info = null;

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

    public List<Image__> getImages() {
        return images;
    }

    public void setImages(List<Image__> images) {
        this.images = images;
    }

    public List<Highlight__> getHighlight() {
        return highlight;
    }

    public void setHighlight(List<Highlight__> highlight) {
        this.highlight = highlight;
    }

    public List<Info__> getInfo() {
        return info;
    }

    public void setInfo(List<Info__> info) {
        this.info = info;
    }

}
