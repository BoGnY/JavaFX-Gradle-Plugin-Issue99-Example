package the.issue99.example.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import the.issue99.example.MainApplication;

/**
 * Utility class for controlling navigation between layouts.<br>
 * <br>
 * All methods on the navigator are static to facilitate simple access from
 * anywhere in the application.<br>
 * <br>
 * Based on jewelsea vista navigator
 * {@link https://gist.github.com/jewelsea/6460130}
 *
 * @author BoGnY
 */
public class LayoutSwitcher {
    private static MainApplication mainApplication;
    /**
     * Convenience constants for fxml layouts managed by the switcher.
     */
    public static final String MAIN = "the/issue99/example/view/main.fxml";
    public static final String VIEW = "the/issue99/example/view/view1.fxml";
    /**
     * The main application layout controller.
     */
    private static LayoutController layoutController;

    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param layoutController The main application layout controller.
     */
    public static void setMainController(LayoutController layoutController) {
        LayoutSwitcher.layoutController = layoutController;
    }

    /**
     * Loads the layout specified by the fxml file into the layoutHolder
     * AnchorPane of the main application layout.
     *
     * @param layoutFxml The fxml file to be loaded.
     */
    public static void loadLayout(String layoutFxml) {
        try {
            layoutController.setLayout(FXMLLoader.load(ClassLoader.getSystemResource(layoutFxml)));
        } catch (IOException IOEx) {
            IOEx.printStackTrace();
        }
    }

    /**
     * Loads the main fxml layout. Sets up the layout switching
     * LayoutSwitcher.<br>
     * Loads the first layout into the fxml layout.
     *
     * @return The loaded pane.
     *
     * @throws IOException If the pane could not be loaded.
     */
    public static Pane loadMainPane() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();

        Pane mainPane = (Pane) fxmlLoader.load(ClassLoader.getSystemResourceAsStream(LayoutSwitcher.MAIN));

        LayoutController layoutController = fxmlLoader.getController();
        layoutController.setMainApp(mainApplication);

        LayoutSwitcher.setMainController(layoutController);
        LayoutSwitcher.loadLayout(LayoutSwitcher.VIEW);

        return mainPane;
    }

    /**
     * Creates the main application scene.
     *
     * @param mainPane The main application layout.
     *
     * @return The created scene.
     */
    public static Scene createScene(Pane mainPane) {
        Scene scene = new Scene(mainPane);
        scene.getStylesheets().setAll(ClassLoader.getSystemResource("the/issue99/example/style/layout.css").toExternalForm());

        return scene;
    }

}
