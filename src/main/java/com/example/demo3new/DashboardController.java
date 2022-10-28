package com.example.demo3new;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private ListView<String> python;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        loadData();
    }
    private void loadData(){
        list.removeAll(list);
        String a="Python";
        String b="Java";
        String c="Haskell";
        String d="C++";
        String s="C#";
        String j="Javascript";
        list.addAll(a,b,c,d,s,j);
        python.getItems().addAll(list);


    }
}
