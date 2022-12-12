module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.matador to javafx.fxml;
    exports com.example.matador;
    exports com.example.matador.controllers;
    opens com.example.matador.controllers to javafx.fxml;
}