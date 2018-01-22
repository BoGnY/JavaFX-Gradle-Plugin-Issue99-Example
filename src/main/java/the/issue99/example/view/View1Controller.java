package the.issue99.example.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import the.issue99.example.MainApplication;

/**
 * @author BoGnY
 */
public class View1Controller {
    // Reference to the main application.
    private MainApplication mainApplication;

    /**
     * The constructor. The constructor is called before the initialize()
     * method.
     */
    public View1Controller() {
    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApplication
     */
    public void setMainApp(MainApplication mainApplication) {
        this.mainApplication = mainApplication;
    }

    @FXML
    private void handleHi(ActionEvent actionEvent) {
        System.out.println("Hi!");
    }

}
