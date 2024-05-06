import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, f = 1, n;

        System.out.print("Enter the number: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; ++i) {
            f *= i;
        }

        System.out.println("The factorial of " + n + " is: " + f);
        
        scanner.close();
    }
}
