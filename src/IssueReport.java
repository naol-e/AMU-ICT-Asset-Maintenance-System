import java.util.Date;

public class IssueReport {
    private String reportID;
    private String description;
    private Date reportedDate;
    private String status; // Pending, Assigned, Closed

    public IssueReport(String desc) {
        this.description = desc;
        this.reportedDate = new Date();
        this.status = "Pending";
    }
}
