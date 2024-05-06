import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        b = (a > 0 ? 0 : 1);
        System.out.println("The value of b is " + b);
    }
}
