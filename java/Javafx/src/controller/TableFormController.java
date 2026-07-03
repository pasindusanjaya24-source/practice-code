package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import tm.CustomerTM;

import java.io.IOException;
import java.util.Optional;



public class TableFormController {
    public AnchorPane root;
    public TableView<CustomerTM> tblC;

    public void initialize(){
        table_load();
        tblC.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("Cid"));
        tblC.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("Name"));
        tblC.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("Address"));
        tblC.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("Phone_Number"));

        
    }
    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {

        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do You Want To Log Out...?", ButtonType.YES,ButtonType.NO);
        Optional<ButtonType> buttonType=alert.showAndWait();
        if(buttonType.get().equals(ButtonType.YES)){
            Parent parent = FXMLLoader.load(this.getClass().getResource("../view/DashboardForm.fxml"));
            Scene scene=new Scene(parent);
            Stage primaryStage= (Stage) root.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.setTitle("Dashboard");
            primaryStage.centerOnScreen();
        }
    }
    public void table_load(){
        ObservableList<CustomerTM> columns = tblC.getItems();
        columns.add(new CustomerTM("C001","kamal","Galle","0771564567"));
        columns.add(new CustomerTM("C002","amal","gampaha","0771232267"));
        columns.add(new CustomerTM("C003","nimal","colombo","0771234098"));
        columns.add(new CustomerTM("C004","sunimal","kandy","0721233467"));


        tblC.refresh();


    }
    
    }


