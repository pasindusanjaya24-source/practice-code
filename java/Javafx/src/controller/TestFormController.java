package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TestFormController {
    public TextField txtSomething;
    public Label lblBanner;
    public TextField txtName;

    public void initialize(){
        txtSomething.requestFocus();
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

    }

    public void txtNameOnAction(ActionEvent actionEvent) {
        texttypev();

    }
}
