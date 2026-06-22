package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TestFormController {
    public TextField txtSomething;
    public Label lblBanner;
    public TextField txtName;
    public Button btnHide;
    public Button btnShow;
    public AnchorPane root;

    public void initialize(){
        txtSomething.requestFocus();
        btnHide.setVisible(false);
        btnShow.setVisible(false);
    }

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        System.out.println("hello java");

    }
    public void textType(){
        String Something=txtSomething.getText();
        System.out.println(Something);
        txtSomething.clear();
        txtSomething.requestFocus();
        lblBanner.setText(Something);

    }
    public void texttypev(){
        String Some =txtName.getText();
        System.out.println(Some);
        txtName.clear();
        txtName.requestFocus();

    }


    public void btnOKOnAction(ActionEvent actionEvent) {
        textType();
    }

    public void txtSomethingOnAction(ActionEvent actionEvent) {
        textType();
    }

    public void btnSubmitOnAction(ActionEvent actionEvent) {
        texttypev();
        btnHide.setVisible(true);
        btnShow.setVisible(true);

    }

    public void txtNameOnAction(ActionEvent actionEvent) {
        texttypev();
        btnHide.setVisible(true);
        btnShow.setVisible(true);

    }

    public void btnHideOnAction(ActionEvent actionEvent) {
        btnHide.setVisible(false);
        lblBanner.setVisible(false);
    }

    public void btnShowtOnAction(ActionEvent actionEvent) {
        btnHide.setVisible(true);
        lblBanner.setVisible(true);
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/DashboardForm.fxml"));
        Scene scene=new Scene(parent);
        Stage primaryStage= (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.centerOnScreen();
    }
}
