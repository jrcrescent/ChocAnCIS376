package OperatorGUI;

import ProviderGUI.VerificationFormGUIController;
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
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class OperatorMMController implements Initializable {
    public static String AddUser="";
    
    @FXML 
    private Button AddMemberBut;
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
    @FXML
    private void handleAddAction(ActionEvent event){
        if(event.getSource().equals(AddMemberBut)){
            AddUser="Member";
        }
        else{
            AddUser="Provider";
        }
        try{
            Parent  root = FXMLLoader.load(getClass().getResource("AddMemberGUI.fxml"));
            Scene Forgot_scene = new Scene(root);
            Stage scene = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene.setScene(Forgot_scene);
            scene.setTitle("Validation Form");
            scene.show();
        }
        catch (IOException ex) {
            Logger.getLogger(AddMemberGUIController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }  
}
