package com_java_maintenance_application_main_class_package_sama_velma_andin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MaintenanceMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MaintenanceUserInterface.fxml"));

        Scene scene = new Scene(root);
        
        //Image image = new Image("");
        //stage.getIcons().add(image);
        
        stage.setTitle("MAINTENANCE APPLICATION");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
