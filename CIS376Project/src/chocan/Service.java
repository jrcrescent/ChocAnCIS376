package chocan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

/**
 * Represents a service that a provider has provided.
 *
 * @author Hristo Bonev Date: 08/20/2019 - 12:25 AM
 */
public class Service {

    private String currentDateTime;
    private String dateServiceProvided;
    // private String memberName;
    private String memberIDNumber;
    // private String providerName;
    private String providerID;
    private Session session;
    private String comments;
    private int week;
    private static WeekFields weekFields;
    private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    Service() {
        this.currentDateTime = "";
        this.dateServiceProvided = "";
        // this.memberName = "";
        this.memberIDNumber = "";
        this.comments = "";
        this.week = 0;
        this.providerID = "";
        //   this.providerName = "";
    }//end default c-tor;

    Service(String currentDateTime, String dateServiceProvided,
            String memberIDNumber, Session session,
            String comments, String providerID) {
        this.currentDateTime = currentDateTime;
        this.dateServiceProvided = dateServiceProvided;
        //this.memberName = memberName;
        this.memberIDNumber = memberIDNumber;
        this.session = session;
        this.comments = comments;
        this.providerID = providerID;
        //this.providerName = providerName;

        LocalDateTime currDateTime = LocalDateTime.parse(this.currentDateTime, formatter);
        weekFields = WeekFields.of(Locale.getDefault());
        this.week = currDateTime.get(weekFields.weekOfWeekBasedYear());
    }

    public String getCurrentDateTime() {

        return currentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getDateServiceProvided() {
        return dateServiceProvided;
    }

    public void setDateServiceProvided(String dateServiceProvided) {
        this.dateServiceProvided = dateServiceProvided;
    }

    /*public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    } */
    public String getMemberIDNumber() {
        return memberIDNumber;
    }

    public void setMemberIDNumber(String memberIDNumber) {
        this.memberIDNumber = memberIDNumber;
    }

    public Session getSession() {
        return session;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getProviderIDNumber() {
        return providerID;
    }

    public void setProviderIDNumber(String providerIDNumber) {
        this.providerID = providerIDNumber;
    }

}//end Service class
