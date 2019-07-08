
package marketplace.jpr.com.interviewrecyclerviewapi.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subitems_ {

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
    private List<Image_> images = null;
    @SerializedName("Highlight")
    @Expose
    private List<Highlight_> highlight = null;
    @SerializedName("info")
    @Expose
    private List<Info_> info = null;

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

    public List<Image_> getImages() {
        return images;
    }

    public void setImages(List<Image_> images) {
        this.images = images;
    }

    public List<Highlight_> getHighlight() {
        return highlight;
    }

    public void setHighlight(List<Highlight_> highlight) {
        this.highlight = highlight;
    }

    public List<Info_> getInfo() {
        return info;
    }

    public void setInfo(List<Info_> info) {
        this.info = info;
    }

}
