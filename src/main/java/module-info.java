module com.profesor.todo {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.iconsfivetwofive;


    opens com.profesor.todo to javafx.fxml;
    exports com.profesor.todo;
}