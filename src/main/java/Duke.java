/**
 * Generates Duke's responses to user messages.
 */
public class Duke {

    /**
     * Prints Duke's original command-line greeting.
     *
     * @param args Command-line arguments supplied to the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     *
     * @param input User's chat message.
     * @return Duke's response to the message.
     */
    public String getResponse(String input) {
        return "Duke heard: " + input;
    }
}
