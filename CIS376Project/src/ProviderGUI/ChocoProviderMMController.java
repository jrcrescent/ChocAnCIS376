package ProviderGUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

public class ChocoProviderMMController implements Initializable {

    public static String SendMemberID = ""; 
    public static String SendServiceCode = "";
    public static String SendServiceDate = "";
    public static String SendServiceName = "";
    public static String SendServiceFee ="";
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
    private TextField ServiceCode;
    @FXML
    private Label VServiceLabel;
    @FXML
    private Button VServiceButton;
    @FXML
    private Label VServiceName;
    @FXML
    private TextArea CommentArea;
    @FXML
    private Button CommentButton;
    @FXML
    private Label CommentLabel;
    @FXML
    private Label TotalFeeLabel;
    @FXML
    private Button VerifactionBut;
    
    @FXML
    private TableView ServiceTable;
    @FXML
    private TableColumn CodeTable;
    @FXML
    private TableColumn NameTable;
    @FXML
    private TableColumn Feetable;
    //grab information from gloabal Var fro chocan providerdir     private static ArrayList<Session> providerDirectory = new ArrayList<>();
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {            
        if(chocan.ChocAn.verifyMemberIDNumber(VerifyMemberID.getText()).equals("Validated")){
            MemberID.setDisable(false);
            ServiceDate.setDisable(false);
            EnterOfDate.setDisable(false);  
            ServiceDate.setText(java.time.LocalDate.now().toString());
            VMemberLabel.setText("Validated");
        } else{
            MemberID.setDisable(true);
            ServiceDate.setDisable(true);
            EnterOfDate.setDisable(true);
            ServiceTable.setDisable(true); 
            ServiceCode.setDisable(true);
            VServiceButton.setDisable(true);
            VerifactionBut.setDisable(true);   
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
            CommentArea.setDisable(true);
            CommentButton.setDisable(true);
            VerifactionBut.setDisable(true);   
            MemberIDLabel.setText("Member ID does match");
        }      
    }
    
    @FXML
    private void handleSCodeBAction(ActionEvent event){ 
        if(chocan.ChocAn.getSessionNameFromCode(ServiceCode.getText()).equals("Invalid")){
            VServiceLabel.setText("Invalid");
            VServiceName.setText("");
            CommentArea.setDisable(true);
            CommentButton.setDisable(true);
            VerifactionBut.setDisable(true);   
        }else{
            VServiceLabel.setText("Validated");
            VServiceName.setText(chocan.ChocAn.getSessionNameFromCode(ServiceCode.getText()));
            CommentArea.setDisable(false);
            CommentButton.setDisable(false);
            TotalFeeLabel.setDisable(false);
            TotalFeeLabel.setText("Total Fee:");
            TotalFeeLabel.setText(TotalFeeLabel.getText()+chocan.ChocAn.getSessionFeeFromCode(ServiceCode.getText()));      
        }
    }
    
    @FXML
    private void handleCommentButtonAction(ActionEvent event){
        if(CommentArea.getLength()<25)
        {
            VerifactionBut.setDisable(false);
        }else{
           CommentLabel.setText("Comment is too long. Max 25 characters");
           VerifactionBut.setDisable(true);     
        }
    }
    
    @FXML
    private void handleVerificationButtionAction(ActionEvent event){
        try{
            Parent  root = FXMLLoader.load(getClass().getResource("VerificationFormGUI.fxml"));
            Scene Forgot_scene = new Scene(root);
            Stage scene = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene.setScene(Forgot_scene);
            scene.setTitle("Validation Form");
            scene.show();
        }
        catch (IOException ex) {
            Logger.getLogger(VerificationFormGUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

}
