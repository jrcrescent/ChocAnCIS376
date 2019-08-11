package chocan;

/** This class represents a single line in the Provider Directory input file. 
 * @author Hristo Bonev */
public class Session {
    private String sessionName;
    private String serviceCode;//not an int because it can have leading 0s
    private double fee;
    
    Session(){
        sessionName = "";
        serviceCode = "";
        fee = 0.0;
    }//default c-tor
    
    Session(String sessionName, String serviceCode, double fee){
        this.sessionName = sessionName;
        this.serviceCode = serviceCode;
        this.fee = fee;
    }//end c-tor
    
    public void setSessionName(String sessionName){
        this.sessionName = sessionName;
    }//end setSessionName()
    
    public String getSessionName(){
        return sessionName;
    }//end getSessionName()
    
    public void setServiceCode(String serviceCode){
        this.serviceCode = serviceCode;
    }//end setServiceCode()
    
    public String getServiceCode(){
        return serviceCode;
    }//end getServiceCode()
    
    public void setFee(double fee){
        this.fee = fee;
    }//end setFee()
    
    public double getFee(){
        return fee;
    }//end getFee()
    
}//end Session Class