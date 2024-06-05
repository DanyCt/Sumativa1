module com.example.sumativa1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumativa1 to javafx.fxml;
    exports com.example.sumativa1;
}