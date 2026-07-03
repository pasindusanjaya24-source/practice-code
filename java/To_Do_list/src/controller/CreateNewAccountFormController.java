package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateNewAccountFormController {
    public AnchorPane root;
    public PasswordField txtNewPassword;
    public PasswordField txtConfirmPassword;
    public Label lblpassworddosenotmatched;
    public Button btnAddUser;
    public TextField txtUserName;
    public TextField txtEmail;
    public Button btnRegister;


    public void initialize(){
        lblpassworddosenotmatched.setVisible(false);
        visible(true);

    }

    public void btnRegisterOnAction(ActionEvent actionEvent) {
        register();


    }

    public void txtConfirmPasswordOnAction(ActionEvent actionEvent) {
        register();

    }
    public void register(){
        String newPassword = txtNewPassword.getText();
        String conformPassword = txtConfirmPassword.getText();

        if(newPassword.equals(conformPassword)){
            System.out.println("equal");
            txtNewPassword.setStyle("-fx-border-color: transparent");
            txtConfirmPassword.setStyle("-fx-border-color: tranparent");
            lblpassworddosenotmatched.setVisible(false);

        }
        else{
            txtNewPassword.setStyle("-fx-border-color: red");
            txtConfirmPassword.setStyle("-fx-border-color: red");
            lblpassworddosenotmatched.setVisible(true);
            txtNewPassword.clear();
            txtConfirmPassword.clear();
            txtNewPassword.requestFocus();
        }

    }

    public void btnAddUserOnAction(ActionEvent actionEvent) {
        visible(false);
    }

    public void visible(boolean v){
        txtUserName.setDisable(v);
        txtEmail.setDisable(v);
        txtNewPassword.setDisable(v);
        txtConfirmPassword.setDisable(v);
        btnRegister.setDisable(v);
    }
}
