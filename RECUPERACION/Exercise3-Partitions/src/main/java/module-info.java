module com.example.exercise3partitions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise3partitions to javafx.fxml;
    exports com.example.exercise3partitions;
}