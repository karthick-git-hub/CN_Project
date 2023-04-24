/**
 * Main Program Entry
 */
public class AESMain {
    public static void main(String[] args) {
        // Check input for file name
        if (args.length < 1) {
            System.out.println("Error: No input file provided. Please run again with a input param.");
        } else {
            // Call non static interface
            AESImplementation aesImplementation = new AESImplementation();
            aesImplementation.run(args);
        }
    }
}