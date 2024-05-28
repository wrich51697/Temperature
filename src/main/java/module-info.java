module com.example.temperature {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.temperature to javafx.fxml;
    exports com.example.temperature;
}