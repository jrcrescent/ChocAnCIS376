package OperatorGUI;

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
public class UpdateOperatorGUIController implements Initializable {

    @FXML
    private TextField NumberIDText;
    @FXML
    private Label IDLabel;
    @FXML
    private TextField NameText;
    @FXML
    private TextField IDText;
    @FXML
    private TextField StreetText;
    @FXML
    private TextField CityText;
    @FXML
    private TextField StateText;
    @FXML
    private TextField ZipText;
    @FXML
    private CheckBox VerifyBox;
    @FXML
    private Label VerifyLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML
    private void handleBackAction(ActionEvent event){
        try{
            Parent  root = FXMLLoader.load(getClass().getResource("OperatorMM.fxml"));
            Scene Forgot_scene = new Scene(root);
            Stage scene = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene.setScene(Forgot_scene);
            scene.setTitle("Main Menu");
            scene.show();
        }
        catch (IOException ex) {
            Logger.getLogger(OperatorMMController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    @FXML
    private void GetInfoAction(ActionEvent event){
        
    }
    @FXML   
    private void handleUpdateAction(ActionEvent event){
        
    }
}
