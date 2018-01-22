package the.issue99.example;

import javafx.application.Application;
import javafx.stage.Stage;
import the.issue99.example.view.LayoutSwitcher;

/**
 * Main application class.
 */
public class MainApplication extends Application {
    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        mainStage.setTitle("JavaFX-Gradle-Plugin-Issue99-Example");

        mainStage.setScene(LayoutSwitcher.createScene(LayoutSwitcher.loadMainPane()));

        mainStage.show();
    }

    public MainApplication() {

    }

    public static void main(String[] args) {
        launch(args);
    }

}
