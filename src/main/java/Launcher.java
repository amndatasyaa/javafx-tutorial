import javafx.application.Application;

/**
 * Launches the JavaFX application while avoiding classpath issues.
 */
public class Launcher {

    /**
     * Starts the JavaFX application.
     *
     * @param args Command-line arguments passed to JavaFX.
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
