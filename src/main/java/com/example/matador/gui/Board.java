package com.example.matador.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Board {
    private GUI gui;
    public Board(GUI gui) {
        this.gui = gui;
    }
    @FXML
    private HBox top;
    @FXML
    private HBox bottom;
    @FXML
    private VBox left;
    @FXML
    private VBox right;

    @FXML
    private VBox startField;
    @FXML
    private VBox prisonField;
    @FXML
    private VBox goToPrisonField;
    @FXML
    private VBox freeParkingField;
    @FXML
    private VBox chanceField;
    @FXML
    private VBox colaField;
    @FXML
    private VBox fantaField;
    @FXML
    private VBox busField;
    @FXML
    private VBox propField;



}
