package com.example.matador;

import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        GUI gui = new GUI();
        gui.startGUI(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}