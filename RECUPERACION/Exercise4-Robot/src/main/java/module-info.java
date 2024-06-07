module com.example.exercise4robot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise4robot to javafx.fxml;
    exports com.example.exercise4robot;
}