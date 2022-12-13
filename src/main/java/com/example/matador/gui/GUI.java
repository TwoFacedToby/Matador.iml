package com.example.matador.gui;

import com.example.matador.Main;
import com.example.matador.gui.MenuScreen;
import com.example.matador.gui.fields.Fields;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI {
    private static MenuScreen menuScreen;
    private static Board board;
    private static Fields fields;
    private Main main;
    private MenuScreen controller;
    private boolean childrenCollected = false;
    Stage stage;

    public GUI(Main main) {
        this.main = main;
        menuScreen = new MenuScreen(this);
        board = new Board(this);
        fields = new Fields(this);
    }

    public void startGUI(Stage s) throws IOException {
        stage = s;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MenuScreen.fxml"));
        controller = fxmlLoader.getController();
        Scene scene = new Scene(fxmlLoader.load(), 540, 360);
        stage.setTitle("Matador");
        stage.setScene(scene);
        stage.show();
    }
    public void Test(){
        System.out.println("Hello");
    }
}
