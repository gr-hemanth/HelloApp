public class HelloApp {
    public static void main(String[] args) {

        StringBuilder namesBuilder = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Enhanced for loop to iterate through names
        for (String name : args) {
            if (namesBuilder.length() > 0) {
                namesBuilder.append(", ");
            }
            namesBuilder.append(name);
        }

        // Final message
        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}