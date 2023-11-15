module com.example.graphic {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.graphic to javafx.fxml;
    exports com.example.graphic;
}