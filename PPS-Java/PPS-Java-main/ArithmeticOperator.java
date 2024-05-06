import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, subtract, add, multiply, divide;

        System.out.print("ENTER ANY 2 NUMBERS: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        subtract = a - b;
        System.out.println("Subtraction = " + subtract);

        add = a + b;
        System.out.println("Addition = " + add);

        multiply = a * b;
        System.out.println("Multiplication = " + multiply);

        divide = a / b;
        System.out.println("Division = " + divide);
    }
}

