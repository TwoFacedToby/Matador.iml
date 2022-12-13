package com.example.matador;

import com.example.matador.gui.GUI;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {
    private static GUI gui;
    @Override
    public void start(Stage stage) throws IOException {
        gui = new GUI(this);
        gui.startGUI(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}