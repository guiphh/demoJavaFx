package com.guiphh.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    public Label helloWorld;

    private Scene secondScene;

    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }

    public void openSecondScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
    }

    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World");

    }
}
