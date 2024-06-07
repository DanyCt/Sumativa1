module com.example.exercise1number_multiple {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise1number_multiple to javafx.fxml;
    exports com.example.exercise1number_multiple;
}