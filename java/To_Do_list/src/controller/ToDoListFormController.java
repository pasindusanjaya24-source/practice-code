package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class ToDoListFormController {
    public Label lblUserID;
    public Label lblUserNameID;
    public AnchorPane root;

    public void initialize(){

    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(parent);
        Stage PrimaryStage = (Stage) root.getScene().getWindow();
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("login to do");
        PrimaryStage.centerOnScreen();
    }

    public void btnAddToListOnAction(ActionEvent actionEvent) {
    }
}
