package chocan;

/**
 * Stores a single line of data from the Provider input file (Data Store).
 *
 * @author Hristo Bonev
 */
public class ProviderRecord {

    private String providerName;
    private String providerIDnumber; //not an int because it can have leading 0s
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;          //not an int because it can have leading 0s

    ProviderRecord() {
        this.providerName = "";
        this.providerIDnumber = "";
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }//end default c-tor

    ProviderRecord(String providerName, String providerIDnumber, String streetAddress,
            String city, String state, String zipCode) {
        this.providerName = providerName;
        this.providerIDnumber = providerIDnumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
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

}//end ProviderRecord
