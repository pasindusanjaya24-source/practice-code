package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane root;

    public void btnCreateOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/CreateNewAccountForm.fxml"));
        Stage primaryStage=(Stage) root.getScene().getWindow();
        Scene scene=new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test Form");
        primaryStage.centerOnScreen();
    }

    public void btnLoginOnAction(ActionEvent actionEvent) {
    }
}
