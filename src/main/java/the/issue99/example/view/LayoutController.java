package the.issue99.example.view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import the.issue99.example.MainApplication;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 *
 * @author BoGnY
 *
 */
public class LayoutController {
    /**
     * Holder of a switchable layout.
     */
    @FXML
    private AnchorPane layoutHolder;

    // Reference to the main application
    private MainApplication mainApplication;

    /**
     * Is called by the main application to give a reference back to itself
     *
     * @param MainApplication
     */
    public void setMainApp(MainApplication mainApplication) {
        this.mainApplication = mainApplication;
    }

    /**
     * Replaces the layout displayed in the layout holder with a new layout.
     *
     * @param layoutNode The layout node to be swapped in.
     */
    public void setLayout(Node layoutNode) {
        layoutHolder.getChildren().setAll(layoutNode);
    }

}
