module com.example.exercise2ladder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise2ladder to javafx.fxml;
    exports com.example.exercise2ladder;
}