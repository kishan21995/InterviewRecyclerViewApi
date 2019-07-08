
package marketplace.jpr.com.interviewrecyclerviewapi.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryResponse {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Best Selling")
    @Expose
    private List<BestSelling> bestSelling = null;
    @SerializedName("Today Savers")
    @Expose
    private List<TodaySaver> todaySavers = null;
    @SerializedName("Blockbuster Savers")
    @Expose
    private List<BlockbusterSaver> blockbusterSavers = null;
    @SerializedName("Categories")
    @Expose
    private List<Category> categories = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BestSelling> getBestSelling() {
        return bestSelling;
    }

    public void setBestSelling(List<BestSelling> bestSelling) {
        this.bestSelling = bestSelling;
    }

    public List<TodaySaver> getTodaySavers() {
        return todaySavers;
    }

    public void setTodaySavers(List<TodaySaver> todaySavers) {
        this.todaySavers = todaySavers;
    }

    public List<BlockbusterSaver> getBlockbusterSavers() {
        return blockbusterSavers;
    }

    public void setBlockbusterSavers(List<BlockbusterSaver> blockbusterSavers) {
        this.blockbusterSavers = blockbusterSavers;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
