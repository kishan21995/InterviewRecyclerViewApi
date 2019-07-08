
package marketplace.jpr.com.interviewrecyclerviewapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("p_manufecture_details")
    @Expose
    private String pManufectureDetails;

    public String getPManufectureDetails() {
        return pManufectureDetails;
    }

    public void setPManufectureDetails(String pManufectureDetails) {
        this.pManufectureDetails = pManufectureDetails;
    }

}
