public class HelloApp {
    public static void main(String[] args) {

        String message;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            // Default case
            message = "Hello, World!";
        }

        // Print the message
        System.out.println(message);
    }
}