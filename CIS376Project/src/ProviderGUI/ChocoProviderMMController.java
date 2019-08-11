package ProviderGUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.time.*;
import javafx.scene.control.Button;

public class ChocoProviderMMController implements Initializable {

    @FXML
    private AnchorPane ProviderAnchorPane;
    @FXML
    private TextField VerifyMemberID;
    @FXML
    private TextField MemberID;
    @FXML
    private TextField ServiceDate;
    @FXML
    private Button EnterOfDate;
    @FXML
    private Label VMemberLabel;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String memberStatus;
        memberStatus=chocan.ChocAn.verifyMemberIDNumber(VerifyMemberID.getText());
        System.out.println(memberStatus);
        if(memberStatus=="v"){
            MemberID.setDisable(false);
            ServiceDate.setDisable(false);
            EnterOfDate.setDisable(false);  
            VMemberLabel.setText("Valid");
        } else if(memberStatus=="Error! ID should be 9 characters long!"){
            MemberID.setDisable(true);
            ServiceDate.setDisable(true);
            EnterOfDate.setDisable(true);
            VMemberLabel.setText(memberStatus);
        } else if(memberStatus=="i"){
            
        }
    }

    @FXML
    private void handleMemberVerificationButtonAction(ActionEvent event){
            
    }
    @FXML
    private void handleServicCodeButtonAction(ActionEvent event){
        
    }
    @FXML
    private void handleCommentButtonAction(ActionEvent event){
        
    }
    @FXML
    private void handleVerificationButtionAction(ActionEvent event){
        
    }  

}
