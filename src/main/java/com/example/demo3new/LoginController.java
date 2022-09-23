package com.example.demo3new;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    Button loginbutton, registrationbutton;
    @FXML
    TextField emailtext , passwordtext;
    @FXML
    TextField password = new TextField();
    @FXML
    TextField email = new TextField();
    public void loginbuttonClicked(ActionEvent event){
       if (email.getText().equals("ramo@gmail.com") && (password.getText().equals("12345"))) {
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

    public void registrationbuttonClicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("registration.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 370, 574);
            Stage stage = new Stage();
            stage.setTitle("REGISTRATION PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
