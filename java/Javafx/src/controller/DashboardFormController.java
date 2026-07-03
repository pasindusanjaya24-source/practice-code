package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {

    public AnchorPane root;


    public void btnTestFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/TestForm.fxml"));

        Stage primayStage= (Stage) root.getScene().getWindow();
        Scene scene=new Scene(parent);
        primayStage.setScene(scene);
        primayStage.setTitle("Test Form");
        primayStage.centerOnScreen();

    }

    public void btnCalculatorFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/CalculatorForm.fxml"));

        Stage primayStage= (Stage) root.getScene().getWindow();
        Scene scene=new Scene(parent);
        primayStage.setScene(scene);
        primayStage.setTitle("Test Form");
        primayStage.centerOnScreen();
    }




    public void btnTaleOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/TableForm.fxml"));

        Stage primayStage= (Stage) root.getScene().getWindow();
        Scene scene=new Scene(parent);
        primayStage.setScene(scene);
        primayStage.setTitle("Table Form");
        primayStage.centerOnScreen();
    }
}
