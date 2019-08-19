package cis376project;

import static chocan.ChocAn.readMembersInputFile;
import static chocan.ChocAn.readProviderDirectoryInputFile;
import static chocan.ChocAn.readProvidersInputFile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CIS376Project extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/ProviderGUI/ChocoMemberID.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/OperatorGUI/OperatorMM.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Provider Login");
        stage.show();
    }

    public static void main(String[] args) {
        readProviderDirectoryInputFile();
        readProvidersInputFile();
        readMembersInputFile();
        launch(args);        

    }

}
