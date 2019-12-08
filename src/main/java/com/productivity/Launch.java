package com.productivity;

import com.productivity.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class Launch extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        RecordManager recordManager = new RecordManager();
        ViewFactory factory = new ViewFactory(recordManager);
        factory.showMainWindow();
    }
}
