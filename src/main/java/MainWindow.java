import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * Controls the main Duke user interface defined in MainWindow.fxml.
 */
public class MainWindow extends AnchorPane {

    private final Image userImage = new Image(getClass().getResourceAsStream("/images/DaUser.png"));
    private final Image dukeImage = new Image(getClass().getResourceAsStream("/images/DaDuke.png"));

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private VBox dialogContainer;

    @FXML
    private TextField userInput;

    @FXML
    private Button sendButton;

    private Duke duke;

    /**
     * Initializes bindings after FXML injects the user interface controls.
     */
    @FXML
    public void initialize() {
        scrollPane.vvalueProperty().bind(dialogContainer.heightProperty());
    }

    /**
     * Supplies the Duke instance used to generate responses.
     *
     * @param duke Duke instance used by this controller.
     */
    public void setDuke(Duke duke) {
        this.duke = duke;
    }

    /**
     * Displays the user's message and Duke's response, then clears the input field.
     */
    @FXML
    private void handleUserInput() {
        String input = userInput.getText();
        String response = duke.getResponse(input);

        dialogContainer.getChildren().addAll(
                DialogBox.getUserDialog(input, userImage),
                DialogBox.getDukeDialog(response, dukeImage)
        );
        userInput.clear();
    }
}
