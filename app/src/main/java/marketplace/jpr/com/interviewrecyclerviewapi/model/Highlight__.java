
package marketplace.jpr.com.interviewrecyclerviewapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Highlight__ {

    @SerializedName("p_desc")
    @Expose
    private String pDesc;
    @SerializedName("p_keyfeaturs")
    @Expose
    private String pKeyfeaturs;
    @SerializedName("p_quantity")
    @Expose
    private String pQuantity;
    @SerializedName("p_pack_type")
    @Expose
    private String pPackType;
    @SerializedName("p_disclaimer")
    @Expose
    private String pDisclaimer;

    public String getPDesc() {
        return pDesc;
    }

    public void setPDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public String getPKeyfeaturs() {
        return pKeyfeaturs;
    }

    public void setPKeyfeaturs(String pKeyfeaturs) {
        this.pKeyfeaturs = pKeyfeaturs;
    }

    public String getPQuantity() {
        return pQuantity;
    }

    public void setPQuantity(String pQuantity) {
        this.pQuantity = pQuantity;
    }

    public String getPPackType() {
        return pPackType;
    }

    public void setPPackType(String pPackType) {
        this.pPackType = pPackType;
    }

    public String getPDisclaimer() {
        return pDisclaimer;
    }

    public void setPDisclaimer(String pDisclaimer) {
        this.pDisclaimer = pDisclaimer;
    }

}
