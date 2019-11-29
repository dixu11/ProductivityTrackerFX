module JavaFXProject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires gson;

    opens com.productivity;
    opens com.productivity.controller;
}