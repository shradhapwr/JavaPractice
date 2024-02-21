package newjavaPractice;

public class BreakNContinue {
    public static void main(String[] args) {
        // Example with break statement
        System.out.println("Example with break statement:");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = 3");
                break; // Exit the loop when i is 3
            }
            System.out.println("i: " + i);
        }

        // Example with continue statement
        System.out.println("\nExample with continue statement:");
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                System.out.println("Skipping the loop at j = 2");
                continue; // Skip the rest of the code for j equals 2
            }
            System.out.println("j: " + j);
        }
    }
}
