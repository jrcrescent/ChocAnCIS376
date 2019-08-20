package chocan;

/** Represents a service that a provider has provided.
 * @author Hristo Bonev 
 * Date: 08/20/2019 - 12:25 AM */
public class ServiceProvided {
    private String dateAndTime;
    private String dateServiceProvided;
    private String memberName;
    private String memberIDNumber;
    private String serviceCode;
    private double fee;
    private String comments;
    private int week;

    ServiceProvided(){
        this.dateAndTime = "";
        this.dateServiceProvided = "";
        this.memberName = "";
        this.memberIDNumber = "";
        this.serviceCode = "";
        this.fee = 0;
        this.comments = "";
        this.week = 0;
    }//end default c-tor;
    
    ServiceProvided(String dateAndTime, String dateServiceProvided, String memberName,
                    String memberIDNumber, String serviceCode, double fee,
                    String comments, int week){
        this.dateAndTime = dateAndTime;
        this.dateServiceProvided = dateServiceProvided;
        this.memberName = memberName;
        this.memberIDNumber = memberIDNumber;
        this.serviceCode = serviceCode;
        this.fee = fee;
        this.comments = comments;
        this.week = week;
    }
    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getDateServiceProvided() {
        return dateServiceProvided;
    }

    public void setDateServiceProvided(String dateServiceProvided) {
        this.dateServiceProvided = dateServiceProvided;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberIDNumber() {
        return memberIDNumber;
    }

    public void setMemberIDNumber(String memberIDNumber) {
        this.memberIDNumber = memberIDNumber;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
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
    
}//end ServiceProvided class
