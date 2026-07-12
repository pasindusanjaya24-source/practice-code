package controller;

import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class CreateNewAccountFormController {
    public AnchorPane root;
    public PasswordField txtNewPassword;
    public PasswordField txtConfirmPassword;
    public Label lblpassworddosenotmatched;
    public Button btnAddUser;
    public TextField txtUserName;
    public TextField txtEmail;
    public Button btnRegister;
    public Label lblID;
    public Label lblEmailError;


    public void initialize(){
        lblpassworddosenotmatched.setVisible(false);
        visible(true);
        lblEmailError.setVisible(false);

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
        lblEmailError.setVisible(true);

        if(newPassword.equals(conformPassword)){
            System.out.println("equal");
            txtNewPassword.setStyle("-fx-border-color: transparent");
            txtConfirmPassword.setStyle("-fx-border-color: tranparent");
            lblpassworddosenotmatched.setVisible(false);


            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            String userEmail = txtEmail.getText().trim();


            if (!userEmail.matches(emailRegex)) {
                lblEmailError.setText("Invalid Email Address!");
                txtEmail.setStyle("-fx-border-color: red; -fx-border-radius: 8;");

                return;
            }



            String id = lblID.getText();
            String username = txtUserName.getText();
            String email = txtEmail.getText();
            Connection connection=DBConnection.getInstance().getConnection();
            try {
                PreparedStatement preparedStatement=connection.prepareStatement("insert into user values (?,?,?,?)");
                preparedStatement.setObject(1,id);
                preparedStatement.setObject(2,username);
                preparedStatement.setObject(3,email);
                preparedStatement.setObject(4,conformPassword);
                int i = preparedStatement.executeUpdate();
                if (i != 0){
                    Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Success......!");
                    alert.showAndWait();
                    Parent parent= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
                    Scene scene=new Scene(parent);
                    Stage primaryStage= (Stage) root.getScene().getWindow();
                    primaryStage.setScene(scene);
                    primaryStage.setTitle("login to to-do list");
                    primaryStage.centerOnScreen();
                }else{
                    Alert alert=new Alert(Alert.AlertType.ERROR,"Something Went Wrong");
                    alert.showAndWait();

                }

            } catch (SQLException | IOException e) {
                throw new RuntimeException(e);
            }


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
        autoGenerateID();
    }

    public void visible(boolean v){
        txtUserName.setDisable(v);
        txtEmail.setDisable(v);
        txtNewPassword.setDisable(v);
        txtConfirmPassword.setDisable(v);
        btnRegister.setDisable(v);
    }
    public void autoGenerateID(){
        Connection connection= DBConnection.getInstance().getConnection(); 
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select id from user order by id desc limit 1");
            boolean isExist = resultSet.next();

            if(isExist){
                String oldID = resultSet.getString(1);
                String oldId = oldID.substring(1,oldID.length());
                int intId = Integer.parseInt(oldId);
                System.out.println(intId);
                intId+=1;
                if (intId<10){
                    lblID.setText("U00"+intId);
                } else if (intId<100) {
                    lblID.setText("U0"+intId);

                }else{
                    lblID.setText("U"+intId);

                }


            }else {
                lblID.setText("U001");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
