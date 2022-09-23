package com.example.demo3new;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {
    @FXML
    Button cancelbutton, registrationbutton;
    TextField fnametext , lnametext , cnumbertext , pnumbertext , emailtext , passwordtext ;

    @FXML
    private ComboBox<Integer> ff;
    @FXML
    private ComboBox<String> ff2;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        Integer rooms[] = {202, 200, 450, 646, 233};
        String groups[] = {"1f1", "1f2", "2f1", "2f1", "3E"};

        ObservableList<Integer> data = FXCollections.observableArrayList(rooms);
        ff.setItems(data);

        ObservableList<String> data2 = FXCollections.observableArrayList(groups);
        ff2.setItems(data2);
    };

    public void cancelbuttonClicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 370, 574);
            Stage stage = new Stage();
            stage.setTitle("LOGIN PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void registrationbuttonClicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("welcome.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 370, 574);
            Stage stage = new Stage();
            stage.setTitle("WELCOME PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}