		
##-- Command line program

public class Example {

    public static void main(String[] args) {
        // Check if there are any command-line arguments
        if (args.length > 0) {
            // Print each command-line argument
            System.out.println("Command-line arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}

-- Compile the program : javac Example.java

-- Run the program with arguments: java Example Hello World 123

-- Output: Command-line arguments:

   Argument 0: Hello
   Argument 1: World
   Argument 2: 123