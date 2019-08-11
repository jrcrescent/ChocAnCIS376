package chocan;

/** Stores a single line of data from the Member input file (Data Store).
 * @author Hristo Bonev */
public class MemberRecord {
    private String memberName;
    private String memberIDnumber;   //not an int because it can have leading 0s
    private String memberStatus;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;          //not an int because it can have leading 0s
    
    MemberRecord(){
        memberName = "";
        memberIDnumber = "";
        memberStatus = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
    }//end default c-tor
    
    MemberRecord(String memberName, String memberIDnumber, String memberStatus,
                 String streetAddress, String city, String state, String zipCode){
        this.memberName = memberName;
        this.memberIDnumber = memberIDnumber;
        this.memberStatus = memberStatus;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }//end c-tor
    
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }//end setMemberName()
    
    public void setMemberIDNumber(String memberIDnumber){
        this.memberIDnumber = memberIDnumber;
    }//end setMemberIDNumber()
    
    public void setMemberStatus(String memberStatus){
        this.memberStatus = memberStatus;
    }//end setMemberStatus()
    
    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }//end setStreetAddress()
    
    public void setCity(String city){
        this.city = city;
    }//end setCity()
    
    public void setState(String state){
        this.state = state;
    }//end setState()
    
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }//end setZipCode()
    
    public String getMemberName(){
        return memberName;
    }//end getMemberName()
    
    public String getMemberIDNumber(){
        return memberIDnumber;
    }//end getMemberIDNumber()
    
    public String getMemberStatus(){
        return memberStatus;
    }//end getMemberStatus()
    
    public String getStreetAddress(){
        return streetAddress;
    }//end getStreetAddress()
    
    public String getCity(){
        return city;
    }//end getCity()
    
    public String getState(){
        return state;
    }//end getState()
    
    public String getZipCode(){
        return zipCode;
    }//end getZipCode()
    
}//end MemberRecord Class