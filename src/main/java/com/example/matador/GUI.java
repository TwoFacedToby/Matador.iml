package com.example.matador;

import com.example.matador.controllers.MenuScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI {
    private MenuScreen controller;
    private boolean childrenCollected = false;
    Stage stage;
    public void startGUI(Stage s) throws IOException {
        stage = s;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MenuScreen.fxml"));
        controller = fxmlLoader.getController();
        Scene scene = new Scene(fxmlLoader.load(), 540, 360);
        stage.setTitle("Matador");
        stage.setScene(scene);
        stage.show();
    }

    /*Have this in all controllers
    private void switchScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("Board.fxml"));
        Scene scene = new Scene(root, 1080, 720);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    }*/
}
