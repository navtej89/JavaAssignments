import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        
        System.out.print("Enter value of A: ");
        int A = scanner.nextInt(); // Read an integer input from the user

        if (A > 0) {
            System.out.println("A is a positive number"); // Print if A is positive
        }

        scanner.close(); // Close the scanner
    }
}
