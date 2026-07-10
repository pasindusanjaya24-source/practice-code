package controller;

import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFormController {
    public AnchorPane root;
    public TextField txtUserName;
    public PasswordField txtPassword;

    public void btnCreateOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/CreateNewAccountForm.fxml"));
        Stage primaryStage=(Stage) root.getScene().getWindow();
        Scene scene=new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test Form");
        primaryStage.centerOnScreen();
    }

    public void btnLoginOnAction(ActionEvent actionEvent) {
        login();
    }

    public void txtPasswordOnAction(ActionEvent actionEvent) {
        login();
    }
    public void login(){
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        Connection connection= DBConnection.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user where user_name=? and password=?");
            preparedStatement.setObject(1,userName);
            preparedStatement.setObject(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                Parent parent=FXMLLoader.load(this.getClass().getResource("../view/ToDoForm.fxml"));
                Scene scene=new Scene(parent);
                Stage primaryStage = (Stage) root.getScene().getWindow();
                primaryStage.setScene(scene);
                primaryStage.setTitle("todo list");
                primaryStage.centerOnScreen();

            }else{
                Alert alert=new Alert(Alert.AlertType.ERROR,"Invalid User Name or Password.....!");
                alert.showAndWait();
                txtUserName.clear();
                txtPassword.clear();
                txtUserName.requestFocus();
            }

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }
}
