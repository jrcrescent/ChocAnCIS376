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
import javafx.scene.control.TableView;

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
    @FXML
    private TableView ServiceTable;
    @FXML
    private TextField ServiceCode;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String memberStatus;
        memberStatus=chocan.ChocAn.verifyMemberIDNumber(VerifyMemberID.getText());
        System.out.println(memberStatus);
        if(memberStatus.equals("Validated")){
            MemberID.setDisable(false);
            ServiceDate.setDisable(false);
            EnterOfDate.setDisable(false);  
            VMemberLabel.setText("Validated");
        } else{
            MemberID.setDisable(true);
            ServiceDate.setDisable(true);
            EnterOfDate.setDisable(true);
            VMemberLabel.setText(memberStatus);
        }
    }

    @FXML
    private void handleVerificationAction(ActionEvent event){
        
        if(MemberID.getText().equals(VerifyMemberID.getText())){
            ServiceTable.setDisable(false);
        }else{
            ServiceTable.setDisable(true);  
        }
        
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
