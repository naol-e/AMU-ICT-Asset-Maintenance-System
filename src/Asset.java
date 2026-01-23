import java.util.Date;

public class Asset {
    private String assetID;
    private String name;
    private String type;
    private String status; // e.g., Working, Broken
    private Date purchaseDate;

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Getters and Setters
    public String getStatus() { return status; }
}
