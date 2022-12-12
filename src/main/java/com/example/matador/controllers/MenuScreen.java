package com.example.matador.controllers;

import com.example.matador.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MenuScreen {
    private String[] playerNames;
    private int playerAmount;
    @FXML
    private VBox main;
    @FXML
    private VBox mainMenu;
    @FXML
    private Button addPlayer;
    @FXML
    private Button removePlayers;
    @FXML
    private TextField playerNameInput;
    @FXML
    private Label p1;
    @FXML
    private Label p2;
    @FXML
    private Label p3;
    @FXML
    private Label p4;
    Label[] players = null;
    @FXML
    private Label messageBox;


    public VBox getMain() {
        return main;
    }

    public VBox getMainMenu() {
        return mainMenu;
    }
    private void playersCollect(){
        players = new Label[4];
        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
    }

    @FXML
    protected void onAddPlayerPressed() {
        String input = playerNameInput.getText();
        boolean hasLetters = false;
        for(int i = 0; i < input.length(); i++){
            if(Character.isLetterOrDigit(input.charAt(i))) hasLetters = true;
        }
        if(!hasLetters){
            messageBox.setText("You must include at least one letter or digit in the player name.");
        }
        else{
            if(players == null) playersCollect();
            boolean isSpace = false;
            for(int i = 0; i < players.length; i++){
                if(Objects.equals(players[i].getText(), input)){
                    isSpace = true;
                    messageBox.setText("You cannot add the same player twice");
                    break;
                }
                if(Objects.equals(players[i].getText(), "")){
                    isSpace = true;
                    players[i].setText(input);
                    playerNameInput.setText("");
                    messageBox.setText("Successfully added " + input + " to the game");
                    break;
                }
            }
            if(!isSpace){
                messageBox.setText("You have reached the maximum amount of players");
            }
        }
    }
    @FXML
    protected void onRemovePlayersPressed(){
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        messageBox.setText("Successfully removed all players from the game");
    }
    @FXML
    protected void onStartGamePressed(ActionEvent event) throws IOException {
        if(players == null) playersCollect();
        if(players[0].getText() == "" || players[1].getText() == "") messageBox.setText("You must first add a minimum of 2 players to the game");
        for(int i = 0; i < players.length; i++){
            if(players[i].getText() != "") {
                playerAmount++;
            }
        }
        playerNames = new String[playerAmount];
        for(int i = 0; i < playerAmount; i++){
            playerNames[i]=players[i].getText();
        }
        System.out.println("There are " + playerAmount + " players added to the game:");
        switchScene(event);
    }
    private void switchScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("Board.fxml"));
        Scene scene = new Scene(root, 1080, 720);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();//Sets in the middle of screen
        double x = (bounds.getWidth() - scene.getWidth())/2;
        double y = (bounds.getHeight() - scene.getHeight())/2;
        window.setX(x);
        window.setY(y);
    }
}