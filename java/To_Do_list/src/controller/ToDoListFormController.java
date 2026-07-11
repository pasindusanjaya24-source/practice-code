package controller;

import db.DBConnection;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import tm.ToDoTM;

import java.io.IOException;
import java.sql.*;
import java.util.Optional;

public class ToDoListFormController {
    public Label lblUserID;
    public Label lblUserNameID;
    public AnchorPane root;
    public Pane subRoot;
    public TextField txtNewToDo;
    public ListView <ToDoTM>lstToDo;
    public TextField txtSelectedToDo;
    public Button btnUpdate;
    public Button btnDelete;

    public void initialize(){
        String name = db.UserSession.getInstance().getUserName();
        String id = db.UserSession.getInstance().getUserId();

        if (name != null && id != null) {
            lblUserNameID.setText("Welcome " + name + " " );
            lblUserID.setText(id);
        } else {
            lblUserNameID.setText("Welcome Guest");
        }
        subRoot.setVisible(false);
        loadlist();
        txtSelectedToDo.setDisable(true);
        btnDelete.setDisable(true);
        btnUpdate.setDisable(true);
        lstToDo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoTM>() {
            @Override
            public void changed(ObservableValue<? extends ToDoTM> observableValue, ToDoTM toDoTM, ToDoTM t1) {

                ToDoTM selectedItem = lstToDo.getSelectionModel().getSelectedItem();
                if (selectedItem == null){
                    return;
                }
                txtSelectedToDo.setDisable(false);
                btnDelete.setDisable(false);
                btnUpdate.setDisable(false);
                subRoot.setVisible(false);
                txtSelectedToDo.setText(selectedItem.getDescription());

            }
        });

    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do You Want To Log Out..?", ButtonType.YES,ButtonType.NO);
        Optional<ButtonType> buttonType = alert.showAndWait();
        if(buttonType.get().equals(ButtonType.YES)){
            Parent parent= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
            Scene scene=new Scene(parent);
            Stage PrimaryStage = (Stage) root.getScene().getWindow();
            PrimaryStage.setScene(scene);
            PrimaryStage.setTitle("login to do");
            PrimaryStage.centerOnScreen();
        }
    }

    public void btnAddToListOnAction(ActionEvent actionEvent) {
        String id=autoGenerateID();
        String description=txtNewToDo.getText();
        String user_id =lblUserID.getText();
        Connection connection=DBConnection.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into todo values (?,?,?)");
            preparedStatement.setObject(1,id);
            preparedStatement.setObject(2,description);
            preparedStatement.setObject(3,user_id);

            int i = preparedStatement.executeUpdate();
            txtNewToDo.clear();
            subRoot.setVisible(false);
            loadlist();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void btnAddNewToDoOnAction(ActionEvent actionEvent) {

        txtNewToDo.requestFocus();
        lstToDo.getSelectionModel().clearSelection();
        txtSelectedToDo.setDisable(true);
        btnDelete.setDisable(true);
        btnUpdate.setDisable(true);
        subRoot.setVisible(true);
        txtSelectedToDo.clear();

    }
    public String autoGenerateID(){
        Connection connection= DBConnection.getInstance().getConnection();
        String id=null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select id from todo order by id desc limit 1");
            boolean isExist = resultSet.next();

            if(isExist){
                String oldID = resultSet.getString(1);
                String oldId = oldID.substring(1,oldID.length());
                int intId = Integer.parseInt(oldId);
                System.out.println(intId);
                intId+=1;
                if (intId<10){
                    id="T00"+intId;
                } else if (intId<100) {
                    id="T0"+intId;

                }else{
                    id="T"+intId;

                }


            }else {
                id="T001";

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;

    }
    public void loadlist(){
        ObservableList<ToDoTM> items= lstToDo.getItems();
        items.clear();
        Connection connection=DBConnection.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from todo where user_id=?");
            preparedStatement.setObject(1,db.UserSession.getInstance().getUserId());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String description = resultSet.getString(2);
                String user_id = resultSet.getString(3);


                ToDoTM toDoTM = new ToDoTM(user_id, description, id);

                items.add(toDoTM);
            }
            lstToDo.refresh();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void txtAddOnAction(ActionEvent actionEvent) {
        String id=autoGenerateID();
        String description=txtNewToDo.getText();
        String user_id =lblUserID.getText();
        Connection connection=DBConnection.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into todo values (?,?,?)");
            preparedStatement.setObject(1,id);
            preparedStatement.setObject(2,description);
            preparedStatement.setObject(3,user_id);

            int i = preparedStatement.executeUpdate();
            txtNewToDo.clear();
            subRoot.setVisible(false);
            loadlist();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String text = txtSelectedToDo.getText();
        ToDoTM selectedItem = lstToDo.getSelectionModel().getSelectedItem();


        if (selectedItem == null) {
            new Alert(Alert.AlertType.WARNING, "Please select a To-Do item first!").show();
            return;
        }
        System.out.println("Updating Text: " + text);
        System.out.println("Updating ID: " + selectedItem.getId());

        Connection connection = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE todo SET description = ? WHERE id = ?");
            preparedStatement.setObject(1, text);
            preparedStatement.setObject(2, selectedItem.getId());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {

                new Alert(Alert.AlertType.INFORMATION, "To-Do Item Updated Successfully!").show();


                lstToDo.getSelectionModel().clearSelection();
                loadlist();

                txtSelectedToDo.setDisable(true);
                btnDelete.setDisable(true);
                btnUpdate.setDisable(true);
                txtSelectedToDo.clear();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to update database!").show();
            }

        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, "Database Error: " + e.getMessage()).show();
            e.printStackTrace();
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do You Want To Delete This ToDO ...?",ButtonType.YES,ButtonType.NO);
        Optional<ButtonType> buttonType = alert.showAndWait();

        if(buttonType.get().equals(ButtonType.YES)){
            Connection connection=DBConnection.getInstance().getConnection();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from todo where id = ?");
                preparedStatement.setObject(1,lstToDo.getSelectionModel().getSelectedItem().getId());
                preparedStatement.executeUpdate();
                loadlist();
                txtSelectedToDo.setDisable(true);
                btnDelete.setDisable(true);
                btnUpdate.setDisable(true);
                txtSelectedToDo.clear();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
