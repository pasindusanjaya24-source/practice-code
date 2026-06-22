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

public class CalculatorFormController {

    public AnchorPane root;
    public Button btnBack;
    public TextField txtNum1;
    public TextField txtNum2;
    public Label lblAnswer;

    public void btnClearOnAction(ActionEvent actionEvent) {
        txtNum1.clear();
        txtNum2.clear();
        txtNum1.requestFocus();
        lblAnswer.setText("00");

    }

    public void btnCalOnAction(ActionEvent actionEvent) {
        cal();
    }
    public void txtNumOnAction(ActionEvent actionEvent) {
        cal();
    }
    public void cal (){
        String in1=txtNum1.getText();
        int n1=Integer.parseInt(in1);
        String in2 =txtNum2.getText();
        int n2=Integer.parseInt(in2);
        int total=n1+n2;
       lblAnswer.setText(total+"");

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
