module com.example.demo3new {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.demo3new to javafx.fxml;
    exports com.example.demo3new;
}