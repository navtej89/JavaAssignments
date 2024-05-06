import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float dividend, divisor, quotient;

        while (true) {
            System.out.print("\nEnter value of dividend: ");
            dividend = scanner.nextFloat();

            System.out.print("\nEnter value of divisor: ");
            divisor = scanner.nextFloat();

            try {
                if (divisor == 0) {
                    throw new ArithmeticException();
                } else {
                    quotient = dividend / divisor;
                    System.out.println("Quotient = " + quotient);
                }
            } catch (ArithmeticException e) {
                System.out.println("Exception: divisor cannot be 0");
            }
        }
        // scanner.close(); // This line would normally be here if we ever planned to exit the loop
    }
}
