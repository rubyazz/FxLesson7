package com.example.demo3new;

//
//import com.sun.javafx.tk.quantum.PaintRenderJob;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    @FXML
    private ImageView Exit;
    Stage stage = null;
    @FXML
    private Label Menu;

    @FXML
    private AnchorPane myPane;
    @FXML
    private Label MenuClose;

    @FXML
    private AnchorPane slider;

    @FXML
    private AnchorPane tmpPane;

    @FXML
    private ImageView exit_img, exit_img1;







    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        slider.setTranslateX(-176);




        exit_img.setOnMouseClicked(event->{
            stage = (Stage) myPane.getScene().getWindow();
            if (stage.isMaximized()) {
                stage.setMaximized(false);
            } else {
                stage.setMaximized(true);
            }
        });

        Menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e) -> {
                Menu.setVisible(false);
                MenuClose.setVisible(true);
            });
        });


        exit_img1.setOnMouseClicked(MouseEvent -> {
            ((Stage)((ImageView)MouseEvent.getSource()).getScene().getWindow()).setIconified(true);
        });



        MenuClose.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e) -> {
                Menu.setVisible(true);
                MenuClose.setVisible(false);
            });
        });
    }




    @FXML
    private  void itemMembres(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            tmpPane.getChildren().clear();
            tmpPane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
