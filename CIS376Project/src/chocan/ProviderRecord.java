package chocan;

import java.util.ArrayList;

/** Stores all information relating to providers
 * @author Hristo Bonev */
public class ProviderRecord {

    private String providerName;
    private String providerIDnumber; //not an int because it can have leading 0s
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;          //not an int because it can have leading 0s
    private ArrayList<ServiceProvided> servicesProvided;

    ProviderRecord() {
        this.providerName = "";
        this.providerIDnumber = "";
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.servicesProvided = new ArrayList<>();
    }//end default c-tor

    ProviderRecord(String providerName, String providerIDnumber, String streetAddress,
            String city, String state, String zipCode, ArrayList<ServiceProvided> servicesProvided) {
        this.providerName = providerName;
        this.providerIDnumber = providerIDnumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.servicesProvided = servicesProvided;
    }//end c-tor

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }//end setProviderName()

    public String getProviderName() {
        return providerName;
    }//end getProviderName()

    public void setProviderIDnumber(String providerIDnumber) {
        this.providerIDnumber = providerIDnumber;
    }//end setProviderIDnumber()

    public String getProviderIDnumber() {
        return providerIDnumber;
    }//end getProviderIDnumber()

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }//end setStreetAddress()

    public String getStreetAddress() {
        return streetAddress;
    }//end getStreetAddress()

    public void setCity(String city) {
        this.city = city;
    }//end setCity()

    public String getCity() {
        return city;
    }//end getCity()

    public void setState(String state) {
        this.state = state;
    }//end setState()

    public String getState() {
        return state;
    }//end getState()

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }//end setZipCode()

    public String getZipCode() {
        return zipCode;
    }//end getZipCode()
    
    public int getTotalNumConsultations(){
        int consultationsTotal = 0;
        
        //TO BE ADDED
        
        return consultationsTotal;
    }//end getTotalNumConsultations()
    
    public double getTotalWeeklyFee(){
        double weeklyFee = 0;
        
        //TO BE ADDED 
        
        return weeklyFee;
    }//end getTotalWeeklyFee();
    
    @Override
    public String toString(){
        return providerName + "," + providerIDnumber + "," + streetAddress
        + "," + city + "," + state + "," + zipCode;
    }

}//end ProviderRecord
