package chocan;

/** Represents a service that a member received. 
 * @author Hristo Bonev */
public class ServiceReceived {
    private String date;
    private String providerName;
    private String serviceName;
    private int week;
    
    ServiceReceived(){
        this.date = "";
        this.providerName = "";
        this.serviceName = "";
        this.week = 0;
    }//end default c-tor
    
    ServiceReceived(String date, String providerName, String serviceName, int week){
        this.date = date;
        this.providerName = providerName;
        this.serviceName = serviceName;
        this.week = week;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
    
}//end ServiceReceived class