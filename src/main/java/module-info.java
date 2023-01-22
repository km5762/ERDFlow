module com.example.erdflow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.erdflow to javafx.fxml;
    exports com.example.erdflow;
}