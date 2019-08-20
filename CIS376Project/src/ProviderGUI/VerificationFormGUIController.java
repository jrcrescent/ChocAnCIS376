/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProviderGUI;

import OperatorGUI.OperatorMMController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fallenanimes
 */
public class VerificationFormGUIController implements Initializable {
    
    public static boolean GoBack=false;
    @FXML
    private TextField ProviderID;
    @FXML
    private TextField MemberID;
    @FXML
    private TextField ServiceName;
    @FXML
    private TextField ServiceCode;
    @FXML
    private TextField ServiceFee;
    @FXML
    private CheckBox VerifyBox;
    @FXML
    private Label label;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ProviderID.setText(ChocoMemberIDController.SendProviderID);
        MemberID.setText(ChocoProviderMMController.SendMemberID);
        ServiceCode.setText(ChocoProviderMMController.SendServiceCode);
        ServiceName.setText(ChocoProviderMMController.SendServiceName);
        ServiceFee.setText(ChocoProviderMMController.SendServiceFee);
        
    }    
    @FXML
    private void handleBackAction(ActionEvent event){     
        GoBack=true;
        
        try{
            Parent  root = FXMLLoader.load(getClass().getResource("ChocoProviderMM.fxml"));
            Scene Forgot_scene = new Scene(root);
            Stage scene = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene.setScene(Forgot_scene);
            scene.setTitle("Main Menu");
            scene.show();
        }
        catch (IOException ex) {
            Logger.getLogger(ChocoProviderMMController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    @FXML
    private void handleVerifyAction(ActionEvent event){
        GoBack=false;
        if(VerifyBox.isSelected()){
            try{
                Parent  root = FXMLLoader.load(getClass().getResource("ChocoMemberID.fxml"));
                Scene Forgot_scene = new Scene(root);
                Stage scene = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene.setScene(Forgot_scene);
                scene.setTitle("Provider ID");
                scene.show();
            }
            catch (IOException ex) {
                Logger.getLogger(ChocoMemberIDController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            label.setText("Box not checked");
        }  
    }
}
