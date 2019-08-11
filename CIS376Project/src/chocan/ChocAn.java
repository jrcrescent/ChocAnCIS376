package chocan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/** So far it only reads data from all 3 input files and stores it locally.
 * @author Hristo Bonev */
public class ChocAn {
    private static final String PROVIDER_DIR_INPUT_FILE_NAME = "providerDir.txt";
    private static final String MEMBERS_INPUT_FILE_NAME = "membersDataCenter.txt";
    private static final String PROVIDERS_INPUT_FILE_NAME = "providersDataCenter.txt";
    
    /*The provider directory input file is stored in this data structure. 
      Each line of the input file is stored at a separate index.*/
    private static ArrayList<Session> providerDirectory = new ArrayList<>();
    
    /*The provider input file is stored in this data structure.
      Each provider and his info are stored at a separate index.*/
    private static ArrayList<ProviderRecord> providerRecords = new ArrayList<>();
    
    /*The member input file is stored in this data structure.
      Each member and his info are stored at a separate index.*/
    private static ArrayList<MemberRecord> memberRecords = new ArrayList<>();
    
    private static Scanner scan;        //to read input file(s)
    private static PrintWriter printWr; //writes to output file(s)
         
    public static void readProviderDirectoryInputFile(){
        try{
            scan = new Scanner(new File(PROVIDER_DIR_INPUT_FILE_NAME));
            
            while(scan.hasNext()){
                //tempLine = a single line from the provider dir input file
                String tempLine = scan.nextLine();
                
                /*Splits the line into tokens:
                  tokenizedLine[0] = session name
                  tokenizedLine[1] = service code
                  tokenizedLine[2] = fee */
                String[] tokenizedLine = tempLine.split(",");
                
                //creating a temporary Session object 
                Session tempSession = new Session();
                
                //initializes all data fields of the temp object
                tempSession.setSessionName(tokenizedLine[0]);
                tempSession.setServiceCode(tokenizedLine[1]);
                tempSession.setFee(Double.parseDouble(tokenizedLine[2]));
                
                providerDirectory.add(tempSession); //add session to ArrayList
            }
        }//end try
        catch(FileNotFoundException e){
            //maybe a label within the GUI saying: ("Error: Input file " + MEMBERS_INPUT_FILE_NAME + " not found.")
        }
    }//end readInputFiles()
    
    public static void readProvidersInputFile(){
        //TO BE ADDED
    }//end readProvidersInputFile()
    
    /**Reads input file containing members' info and stores all data locally.*/
    public static void readMembersInputFile() {
        try{
            scan = new Scanner(new File(MEMBERS_INPUT_FILE_NAME));
            
            while(scan.hasNext()){
                //tempLine = a single line from the member's input file
                String tempLine = scan.nextLine();
                
                /*Splits the line into tokens:
                  tokenizedLine[0] = member name
                  tokenizedLine[1] = member ID number
                  tokenizedLine[2] = member status
                  ...
                  tokenizedLine[6] = member's zip code*/
                String[] tokenizedLine = tempLine.split(",");
                
                //creating a temp MemberRecord object
                MemberRecord tempRecord = new MemberRecord();
                
                //initializes all data fields of the tempRecord object
                tempRecord.setMemberName(tokenizedLine[0]);
                tempRecord.setMemberIDNumber(tokenizedLine[1]);
                tempRecord.setMemberStatus(tokenizedLine[2]);
                tempRecord.setStreetAddress(tokenizedLine[3]);
                tempRecord.setCity(tokenizedLine[4]);
                tempRecord.setState(tokenizedLine[5]);
                tempRecord.setZipCode(tokenizedLine[6]);
                
                memberRecords.add(tempRecord); //add given member record
            }
        }
        catch(FileNotFoundException e) {
            //maybe a label within the GUI saying: ("Error: Input file " + MEMBERS_INPUT_FILE_NAME + " not found.")
        }
    }//end readMembersInputFile()
    
    /** Checks the status associated with a given member ID number.
     * @param memberIDnumber a members ID number that needs to be validated.
     * @return a String:
     * "Validated" if member ID number is valid
     * "Member suspended" if member has been suspended 
     * or an error message if entered ID was not in the proper format. */
    public static String verifyMemberIDNumber(String memberIDnumber){
        String status = "Invalid number";
        
        //checking if entered ID is 9 characters long. 
        if(memberIDnumber.length() != 9){
            status = "Error! ID should be 9 integers long!";
        }
        
        //checking if entered ID is composed of numbers only. 
        char[] tempArray = memberIDnumber.toCharArray();
        
        for (int i = 0 ; i < tempArray.length ; i++){
            if(tempArray[i] < 48 || tempArray[i] > 57 ){
                status = "Error! Entered ID can consist of numbers only [1-9].";
                break;
            }
        }//end for loop
        
        //traversing through memberRecords to find if there's a matching ID
        for (int i = 0 ; i < memberRecords.size() ; i++){
            if(memberIDnumber.equals(memberRecords.get(i).getMemberIDNumber())){
                status = memberRecords.get(i).getMemberStatus();
                break;
            }
        }//end for
        
        return status;
    }//end verifyMemberIDNumber()
    
}//end ChocAn class