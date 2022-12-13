module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.matador to javafx.fxml;
    exports com.example.matador;
    exports com.example.matador.gui;
    opens com.example.matador.gui to javafx.fxml;
    exports com.example.matador.gui.fields;
    opens com.example.matador.gui.fields to javafx.fxml;
}