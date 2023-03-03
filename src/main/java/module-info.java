module com.example.stringtochars {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stringtochars to javafx.fxml;
    exports com.example.stringtochars;
}