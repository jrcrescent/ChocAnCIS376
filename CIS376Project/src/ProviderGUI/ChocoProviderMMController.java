package ProviderGUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.time.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ChocoProviderMMController implements Initializable {

    @FXML
    private TextField VerifyMemberID;
    @FXML
    private Label VMemberLabel;
    @FXML
    private TextField MemberID;
    @FXML
    private Label MemberIDLabel;
    @FXML
    private TextField ServiceDate;
    @FXML
    private Button EnterOfDate;
    @FXML
    private TableView ServiceTable;
    @FXML
    private TextField ServiceCode;
    @FXML
    private Label VServiceLabel;
    @FXML
    private Button VServiceButton;
    @FXML
    private Label VServiceName;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
            if(chocan.ChocAn.verifyMemberIDNumber(VerifyMemberID.getText()).equals("Validated")){
            MemberID.setDisable(false);
            ServiceDate.setDisable(false);
            EnterOfDate.setDisable(false);  
            VMemberLabel.setText("Validated");
        } else{
            MemberID.setDisable(true);
            ServiceDate.setDisable(true);
            EnterOfDate.setDisable(true);
            VMemberLabel.setText(chocan.ChocAn.verifyMemberIDNumber(VerifyMemberID.getText()));
        }
    }

    @FXML
    private void handleVerificationAction(ActionEvent event){
        
        if(MemberID.getText().equals(VerifyMemberID.getText())){
            ServiceTable.setDisable(false);
            ServiceCode.setDisable(false);
            VServiceButton.setDisable(false);
            MemberIDLabel.setText("Validated");
        }else{
            ServiceTable.setDisable(true); 
            ServiceCode.setDisable(true);
            VServiceButton.setDisable(true);
            MemberIDLabel.setText("Member ID does match");
        }
        
    }
    @FXML
    private void handleSCodeBAction(ActionEvent event){ 
        if(chocan.ChocAn.getSessionNameFromCode(ServiceCode.getText()).equals("Invalid")){
            VServiceLabel.setText("Invalid");
            
        }else{
            VServiceLabel.setText("Validated");
            VServiceName.setText(chocan.ChocAn.getSessionNameFromCode(ServiceCode.getText()));
        }

    }
    
    @FXML
    private void handleCommentButtonAction(ActionEvent event){
        
    }
    
    @FXML
    private void handleVerificationButtionAction(ActionEvent event){
        
    }  

}
